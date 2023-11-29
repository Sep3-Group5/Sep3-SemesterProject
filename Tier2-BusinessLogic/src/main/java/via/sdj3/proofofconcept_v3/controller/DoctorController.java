package via.sdj3.proofofconcept_v3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sdj3.proofofconcept_v3.entity.Doctor;
import via.sdj3.proofofconcept_v3.service.DoctorService;
import via.sdj3.proofofconcept_v3.service.DoctorServiceInterface;

import java.util.List;
import java.util.Optional;

@RestController
public class DoctorController {
	private DoctorServiceInterface doctorService;

	public DoctorController(DoctorService doctorService) {
		this.doctorService = doctorService;
	}

	@PostMapping(value="/doctors")
	public ResponseEntity<Object> addDoctor(@RequestBody Doctor doctor){
		try {
			doctorService.addDoctor(doctor);
			System.out.println("Doctor successfully added");
			return ResponseEntity.ok().body(doctor);
		}
		catch (Exception e){
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/doctors")
	public ResponseEntity<List<Doctor>> getAllDoctors(){
		List<Doctor> doctors = doctorService.getAllDoctors();
		return new ResponseEntity<>(doctors, HttpStatus.OK);
	}

	@GetMapping("/doctors/{id}")
	public ResponseEntity<Object> getDoctorById(@PathVariable ("id") int id){
		Optional<Doctor> doctor = doctorService.getDoctorById(id);
		if (!doctor.isPresent()){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(doctor.get(), HttpStatus.OK);
	}

}
