package via.sdj3.proofofconcept_v3.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import via.sdj3.proofofconcept_v3.Dto.LoginDto;
import via.sdj3.proofofconcept_v3.Dto.RegisterDoctorDto;
import via.sdj3.proofofconcept_v3.entity.Doctor;
import via.sdj3.proofofconcept_v3.jwtUtil.JwtUtil;
import via.sdj3.proofofconcept_v3.service.DoctorServiceInterface;

import java.util.Optional;

@RestController
public class DoctorController {

    private DoctorServiceInterface doctorInterface;
    private JwtUtil jwtUtil;

    public DoctorController(@Qualifier("doctorService") DoctorServiceInterface doctorInterface, JwtUtil jwtUtil) {
        this.doctorInterface = doctorInterface;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping(value = "/Doctor/Login")
    public ResponseEntity<Object> loginDoctor(@RequestBody LoginDto dto) {

        String username = doctorInterface.authenticateDoctor(dto.getUserName(), dto.getPassword());

        if (username != null) {
            String token = jwtUtil.generateToken(username);
            return ResponseEntity.ok(token);
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }

    @PostMapping(value = "/Doctor/Register")
    public ResponseEntity<Object> registerDoctor(@RequestBody RegisterDoctorDto dto) {

		try {
			// Forward to patientService for logic
			doctorInterface.registerDoctor(dto.getFullName(), dto.getName(), dto.getSpecialization(), dto.getPassword());
			return ResponseEntity.ok("Doctor account registered");
		} catch (Exception e) {
			return ResponseEntity.status(401).body("Something went wrong");
		}

        	public DoctorController(DoctorService doctorService) {
			this.doctorService = doctorService;
		}

		@PostMapping(value = "/doctors")
		public ResponseEntity<Object> addDoctor (@RequestBody Doctor doctor){
			try {
				doctorService.addDoctor(doctor);
				System.out.println("Doctor successfully added");
				return ResponseEntity.ok().body(doctor);
			} catch (Exception e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
			}
		}

		@GetMapping("/doctors")
		public ResponseEntity<List<Doctor>> getAllDoctors () {
			List<Doctor> doctors = doctorService.getAllDoctors();
			return new ResponseEntity<>(doctors, HttpStatus.OK);
		}

		@GetMapping("/doctors/{id}")
		public ResponseEntity<Object> getDoctorById ( @PathVariable("id") int id){
			Optional<Doctor> doctor = doctorService.getDoctorById(id);
			if (!doctor.isPresent()) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<>(doctor.get(), HttpStatus.OK);
		}

	}
}