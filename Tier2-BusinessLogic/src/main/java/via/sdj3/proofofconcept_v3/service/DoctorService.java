package via.sdj3.proofofconcept_v3.service;

import org.springframework.stereotype.Service;
import via.sdj3.proofofconcept_v3.entity.Doctor;
import via.sdj3.proofofconcept_v3.grpcClient.doctor.DoctorClient;
import via.sdj3.proofofconcept_v3.repository.DoctorRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorService implements DoctorServiceInterface{
    private DoctorRepository doctorRepository;

    private final DoctorClient client;

    public DoctorService(DoctorClient doctorClient) {
        this.client = doctorClient;}

    // METHODS //

    public Doctor addDoctor(Doctor doctor){
        //other checks and validation can be done here
        return client.addDoctor(doctor);
    }

    public List<Doctor> getAllDoctors(){
        List<Doctor> doctors = new ArrayList<>();
        doctorRepository.findAll().forEach(doctor -> doctors.add(doctor));
        return doctors;
    }

    public Optional<Doctor> getDoctorById(int id){
        return doctorRepository.findById(id);
    }

    public String authenticateDoctor(String username, String password) {
        // Implement your logic to authenticate the user
        // Return username if authentication is successful, otherwise return null
        // For simplicity, you can use a hardcoded check, but in real-world scenarios, use a proper authentication mechanism
        if ("test2".equals(username) && "test2".equals(password)) {
            return username;
        } else {
            return null;
        }
    }

    @Override
    public Doctor registerDoctor(String name, String username, String specialization, String password) {
        // check username/password constraints

        // construct doctor object
        Doctor doctor = new Doctor();

        try
        {
            // Send doctor to database
            throw new ExecutionControl.NotImplementedException("not implemented yet");
        }
        catch (Exception e)
        {
          // return exception
        }
        return null;
    }
}


