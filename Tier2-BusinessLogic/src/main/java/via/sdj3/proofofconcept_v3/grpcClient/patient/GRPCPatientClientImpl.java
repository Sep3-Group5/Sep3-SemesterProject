package via.sdj3.proofofconcept_v3.grpcClient.patient;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import org.springframework.stereotype.Service;
import via.sdj3.proofofconcept_v3.GrpcService.PatientGrpc;
import via.sdj3.proofofconcept_v3.GrpcService.PatientObj;
import via.sdj3.proofofconcept_v3.entity.Patient;

@Service
public class GRPCPatientClientImpl implements PatientClient {
    private PatientGrpc.PatientBlockingStub patientBlockingStub;

    public PatientGrpc.PatientBlockingStub getPatientBlockingStub() {
        if (patientBlockingStub == null) {
            ManagedChannel managedChannel = ManagedChannelBuilder
                    .forAddress("localhost", 5021)
                    .usePlaintext()
                    .build();
            patientBlockingStub = PatientGrpc.newBlockingStub(managedChannel);
        }
        return patientBlockingStub;
    }

    @Override
    public Patient addPatient(Patient patient) {
        PatientObj patientObj = PatientObj.newBuilder().setId(patient.getPatientId()).setName(patient.getFullName()).build();

        PatientObj patientObjFromServer;
        try{
            patientObjFromServer = getPatientBlockingStub().createAsync(patientObj);
        }
        catch (StatusRuntimeException e) {
            System.out.println(e.getStatus().getDescription());
            throw new RuntimeException(e.getStatus().getDescription());
        }
        finally {
            patientBlockingStub = null;
        }

        System.out.println(patientObjFromServer.getName());

        Patient realObj = getPatient(patientObjFromServer);
        System.out.println(realObj.getFullName());
        return realObj;
    }

    private Patient getPatient(PatientObj patientObjFromServer) {
        Patient returnedPatient = new Patient();
        returnedPatient.setPatientId(patientObjFromServer.getId());
        returnedPatient.setFullName(patientObjFromServer.getName());
        return returnedPatient;
    }
}
