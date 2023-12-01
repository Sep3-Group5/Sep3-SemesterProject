package via.sdj3.proofofconcept_v3.grpcClient.doctor;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import org.springframework.stereotype.Service;
import via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorGrpc;
import via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj;
import via.sdj3.proofofconcept_v3.entity.Doctor;

@Service
public class GRPCDoctorClientImpl implements DoctorClient {
    private DoctorGrpc.DoctorBlockingStub doctorBlockingStub;

    public DoctorGrpc.DoctorBlockingStub getDoctorBlockingStub() {
        if (doctorBlockingStub == null) {
            ManagedChannel managedChannel = ManagedChannelBuilder
                    .forAddress("localhost", 5021)
                    .usePlaintext()
                    .build();
            doctorBlockingStub = DoctorGrpc.newBlockingStub(managedChannel);
        }
        return doctorBlockingStub;
    }

    @Override
    public Doctor addDoctor(Doctor doctor) {
        DoctorObj doctorObj = DoctorObj.newBuilder().setId(doctor.getId()).setName(doctor.getFullName()).build();

        DoctorObj doctorObjFromServer;
        try{
            doctorObjFromServer = getDoctorBlockingStub().createAsync(doctorObj);
        }
        catch (StatusRuntimeException e) {
            System.out.println(e.getStatus().getDescription());
            throw new RuntimeException(e.getStatus().getDescription());
        }
        finally {
            doctorBlockingStub = null;
        }

        System.out.println(doctorObjFromServer.getName());

        Doctor realObj = getDoctor(doctorObjFromServer);
        System.out.println(realObj.getFullName());
        return realObj;
    }

    private Doctor getDoctor(DoctorObj doctorObjFromServer) {
        Doctor returnedDoctor = new Doctor();
        returnedDoctor.setId(doctorObjFromServer.getId());
        returnedDoctor.setFullName(doctorObjFromServer.getName());
        return returnedDoctor;
    }
}
