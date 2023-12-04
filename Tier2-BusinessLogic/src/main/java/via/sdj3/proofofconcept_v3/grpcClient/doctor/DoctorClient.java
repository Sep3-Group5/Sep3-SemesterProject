package via.sdj3.proofofconcept_v3.grpcClient.doctor;

import org.springframework.stereotype.Service;
import via.sdj3.proofofconcept_v3.entity.Doctor;

@Service
public interface DoctorClient {
	Doctor addDoctor(Doctor doctor);
	Doctor authenticateDoctor(String username, String pswd);
}
