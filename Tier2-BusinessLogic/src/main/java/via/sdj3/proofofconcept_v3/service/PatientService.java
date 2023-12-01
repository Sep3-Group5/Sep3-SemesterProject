package via.sdj3.proofofconcept_v3.service;

import jdk.jshell.spi.ExecutionControl;
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

    public String authenticatePatient(String username, String password) {
        // Implement your logic to authenticate the user
        // Return username if authentication is successful, otherwise return null
        // For simplicity, you can use a hardcoded check, but in real-world scenarios, use a proper authentication mechanism
        if ("test".equals(username) && "test".equals(password)) {
            return username;
        } else {
            return null;
        }
    }

    @Override
    public Patient registerPatient(String username, String password) {
       // check username/password constraints

        // construct patient object
        Patient patient = new Patient();

        try
        {
            // Send patient to database
            throw new ExecutionControl.NotImplementedException("not implemented yet");
        }
        catch (Exception e)
        {
            // return exception
        }
        return null;
    }

}
