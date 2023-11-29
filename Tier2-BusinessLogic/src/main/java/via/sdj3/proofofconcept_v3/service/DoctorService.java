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

	private final DoctorClient doctorClient;

	public DoctorService(DoctorClient doctorClient) {
		this.doctorClient = doctorClient;
	}

	@Override
	public Doctor addDoctor(Doctor doctor) {
		return doctorClient.addDoctor(doctor);
	}

	@Override
	public List<Doctor> getAllDoctors(){
		List<Doctor> doctors = new ArrayList<>();
		doctorRepository.findAll().forEach(doctor -> doctors.add(doctor));
		return doctors;
	}

	@Override
	public Optional<Doctor> getDoctorById(int id){
		return doctorRepository.findById(id);
	}
}


