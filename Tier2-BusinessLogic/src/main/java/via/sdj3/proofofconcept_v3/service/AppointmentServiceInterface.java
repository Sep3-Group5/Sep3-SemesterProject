package via.sdj3.proofofconcept_v3.service;

import org.springframework.stereotype.Service;
import via.sdj3.proofofconcept_v3.entity.Appointment;
import via.sdj3.proofofconcept_v3.entity.Doctor;

import java.util.List;
import java.util.Optional;

@Service
public interface AppointmentServiceInterface {
	Appointment addAppointment(Appointment appointment);
	List<Appointment> getAllAppointments();
	Optional<Appointment> getAppointmentById(int id);
}
