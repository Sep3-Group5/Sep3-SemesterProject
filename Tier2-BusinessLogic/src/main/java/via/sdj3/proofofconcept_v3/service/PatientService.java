package via.sdj3.proofofconcept_v3.service;

import org.springframework.stereotype.Service;
import via.sdj3.proofofconcept_v3.entity.Patient;
import via.sdj3.proofofconcept_v3.grpcClient.patient.PatientClient;
import via.sdj3.proofofconcept_v3.repository.PatientRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService implements PatientServiceInterface{
    private PatientRepository patientRepository;

    private final PatientClient client;

//    public PatientService(PatientRepository patientRepository) {
//        this.patientRepository = patientRepository;
//    }

    public PatientService(PatientClient patientClient) {
        this.client = patientClient;}

    // METHODS //

    public Patient addPatient(Patient patient){
        //other checks and validation can be done here
        return client.addPatient(patient);
    }

    public List<Patient> getAllPatients(){
        List<Patient> patients = new ArrayList<>();
        patientRepository.findAll().forEach(patient -> patients.add(patient));
        return patients;
    }

    public Optional<Patient> getPatientById(int id){
        return patientRepository.findById(id);
    }
}
