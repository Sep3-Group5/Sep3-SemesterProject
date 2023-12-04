package via.sdj3.proofofconcept_v3.grpcClient.patient;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.stereotype.Service;
import via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorLogin;
import via.sdj3.proofofconcept_v3.GrpcService.doctor.DoctorObj;
import via.sdj3.proofofconcept_v3.GrpcService.patient.PatientGrpc;
import via.sdj3.proofofconcept_v3.GrpcService.patient.PatientLogin;
import via.sdj3.proofofconcept_v3.GrpcService.patient.PatientObj;
import via.sdj3.proofofconcept_v3.entity.Doctor;
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

    @Override
    public Patient authenticatePatient(String username, String pswd) {
        return null;
        /*
        PatientLogin patientObj = PatientLogin.newBuilder()
                .setUsername(username)
                .setPassword(pswd)
                .build();

        DoctorObj doctorObjFromServer;
        try{
            patientObjFromServer = getPatientBlockingStub().loginAsPatient(patientObj);
        }
        catch (StatusRuntimeException e) {
            System.out.println(e.getStatus().getDescription());
            throw new RuntimeException(e.getStatus().getDescription());
        }
        finally {
            patientBlockingStub = null;
        }

        System.out.println(doctorObjFromServer.getFullname());
        Patient realObj = getPatient(patientObjFromServer);
        System.out.println(realObj.getFullName());
        return realObj;
*/
    }


    private Patient getPatient(PatientObj patientObjFromServer) {
        Patient returnedPatient = new Patient();
        returnedPatient.setPatientId(patientObjFromServer.getId());
        returnedPatient.setFullName(patientObjFromServer.getName());
        return returnedPatient;
    }
}
