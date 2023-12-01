package via.sdj3.proofofconcept_v3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sdj3.proofofconcept_v3.Dto.LoginDto;
import via.sdj3.proofofconcept_v3.Dto.RegisterPatientDto;
import via.sdj3.proofofconcept_v3.entity.Patient;
import via.sdj3.proofofconcept_v3.jwtUtil.JwtUtil;
import via.sdj3.proofofconcept_v3.service.PatientService;
import via.sdj3.proofofconcept_v3.service.PatientServiceInterface;

import java.util.List;
import java.util.Optional;

@RestController
public class PatientController {

    private PatientServiceInterface patientService;
    private JwtUtil jwtUtil;

    public PatientController(PatientService patientService,JwtUtil jwtUtil) {
        this.patientService = patientService;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping(value = "/Patient/Login")
    public ResponseEntity<Object> loginPatient(@RequestBody LoginDto dto) {

            String username = patientService.authenticatePatient(dto.getUserName(), dto.getPassword());

            if (username != null) {
                String token = jwtUtil.generateToken(username);
                return ResponseEntity.ok(token);
            } else {
                return ResponseEntity.status(401).body("Invalid credentials");
            }
    }

    @PostMapping(value = "/Patient/Register")
    public ResponseEntity<Object> registerPatient(@RequestBody RegisterPatientDto dto) {

        try {
            // Forward to patientService for logic
            patientService.registerPatient(dto.getName(), dto.getPassword());
            return ResponseEntity.ok("Patient account registered");
        } catch (Exception e) {
            return ResponseEntity.status(401).body("Something went wrong");
        }

    }
    @PostMapping(value="/patients")
    public ResponseEntity<Object> addPatient(@RequestBody Patient patient){
        try {
			//patientService.addPatient(patient);
			System.out.println("Patient successfully added");
			return ResponseEntity.ok().body(patient);
		}
		catch (Exception e){
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
    }

	@GetMapping("/patients")
	public ResponseEntity<List<Patient>> getAllPatients(){
		List<Patient> patients = patientService.getAllPatients();
		return new ResponseEntity<>(patients, HttpStatus.OK);
	}

	@GetMapping("/patients/{id}")
	public ResponseEntity<Object> getPatientById(@PathVariable("id") int id){
		Optional<Patient> patient = patientService.getPatientById(id);
		if (!patient.isPresent()){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(patient.get(), HttpStatus.OK);
	}
}
