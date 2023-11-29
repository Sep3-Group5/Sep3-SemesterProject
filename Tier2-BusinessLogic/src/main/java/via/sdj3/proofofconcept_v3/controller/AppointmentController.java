package via.sdj3.proofofconcept_v3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sdj3.proofofconcept_v3.entity.Appointment;
import via.sdj3.proofofconcept_v3.service.AppointmentService;
import via.sdj3.proofofconcept_v3.service.AppointmentServiceInterface;

import java.util.List;
import java.util.Optional;

@RestController
public class AppointmentController {

	private AppointmentServiceInterface appointmentService;

	public AppointmentController(AppointmentService appointmentService) {
		this.appointmentService = appointmentService;
	}

	@PostMapping(value="/appointments")
	public ResponseEntity<Object> addAppointment(@RequestBody Appointment appointment){
		try {
			appointmentService.addAppointment(appointment);
			System.out.println("Appointment successfully added");
			return ResponseEntity.ok().body(appointment);
		}
		catch (Exception e){
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/appointments")
	public ResponseEntity<List<Appointment>> getAllAppointments(){
		List<Appointment> appointments = appointmentService.getAllAppointments();
		return new ResponseEntity<>(appointments, HttpStatus.OK);
	}

	@GetMapping("/appointments/{id}")
	public ResponseEntity<Object> getAppointmentById(@PathVariable ("id") int id){
		Optional<Appointment> appointment = appointmentService.getAppointmentById(id);
		if (!appointment.isPresent()){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(appointment.get(), HttpStatus.OK);
	}
}
