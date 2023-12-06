package via.sdj3.proofofconcept_v3.grpcClient.appointment;

import org.springframework.stereotype.Service;
import via.sdj3.proofofconcept_v3.entity.Appointment;

import java.util.List;

@Service
public interface AppointmentClient {
	Appointment addAppointment(Appointment appointment);

	List<Appointment> getAllAppointments();
}
