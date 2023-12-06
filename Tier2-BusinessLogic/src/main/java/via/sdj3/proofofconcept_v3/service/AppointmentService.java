package via.sdj3.proofofconcept_v3.service;

import org.springframework.stereotype.Service;
import via.sdj3.proofofconcept_v3.entity.Appointment;
import via.sdj3.proofofconcept_v3.grpcClient.appointment.AppointmentClient;
import via.sdj3.proofofconcept_v3.repository.AppointmentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService implements AppointmentServiceInterface{
	private AppointmentRepository appointmentRepository;

	private final AppointmentClient appointmentClient;

	public AppointmentService(AppointmentRepository appointmentRepository, AppointmentClient appointmentClient) {
		this.appointmentRepository = appointmentRepository;
		this.appointmentClient = appointmentClient;
	}

	@Override
	public Appointment addAppointment(Appointment appointment) {
		return appointmentClient.addAppointment(appointment);
	}

	@Override
	public List<Appointment> getAllAppointments(){
		List<Appointment> appointments = new ArrayList<>();
		appointmentRepository.findAll().forEach(appointment -> appointments.add(appointment));
		return appointments;
	}

	@Override
	public Optional<Appointment> getAppointmentById(int id){
		return appointmentRepository.findById(id);
	}
}
