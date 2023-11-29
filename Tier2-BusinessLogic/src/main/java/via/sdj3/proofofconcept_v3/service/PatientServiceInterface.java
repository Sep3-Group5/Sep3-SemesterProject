package via.sdj3.proofofconcept_v3.service;

import org.springframework.stereotype.Service;
import via.sdj3.proofofconcept_v3.entity.Patient;

import java.util.List;
import java.util.Optional;

@Service
public interface PatientServiceInterface {
    Patient addPatient(Patient patient) throws Exception;

	List<Patient> getAllPatients();

	Optional<Patient> getPatientById(int id);
}
