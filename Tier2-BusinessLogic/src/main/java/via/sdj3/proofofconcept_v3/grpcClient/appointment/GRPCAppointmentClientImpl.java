
package via.sdj3.proofofconcept_v3.grpcClient.appointment;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import org.springframework.stereotype.Service;
import via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentGrpc;
import via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentList;
import via.sdj3.proofofconcept_v3.GrpcService.appointment.AppointmentObj;
import via.sdj3.proofofconcept_v3.GrpcService.appointment.RequestFindAppointmentsForDoctorObj;
import via.sdj3.proofofconcept_v3.entity.Appointment;
import via.sdj3.proofofconcept_v3.entity.Doctor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GRPCAppointmentClientImpl implements AppointmentClient {

	private AppointmentGrpc.AppointmentBlockingStub appointmentBlockingStub;

	public AppointmentGrpc.AppointmentBlockingStub getAppointmentBlockingStub() {
		if (appointmentBlockingStub == null) {
			ManagedChannel managedChannel = ManagedChannelBuilder
				.forAddress("localhost", 5021)
				.usePlaintext()
				.build();
			appointmentBlockingStub = AppointmentGrpc.newBlockingStub(managedChannel);
		}
		return appointmentBlockingStub;
	}

	@Override
	public Appointment addAppointment(Appointment appointment) {
		AppointmentObj appointmentObj = AppointmentObj.newBuilder()
			.setId(appointment.getAppointmentId())
			.setDoctorId(appointment.getDoctorId())
			.setPatientId(appointment.getPatientId())
			.setDate(appointment.getDate())
			.setTime(appointment.getTime())
			.setDiagnosis(appointment.getDiagnosis())
			.setStatus(appointment.getStatus())
			.build();

		AppointmentObj appointmentObjFromServer;
		try{
			appointmentObjFromServer = getAppointmentBlockingStub().createAsync(appointmentObj);
		}
		catch (StatusRuntimeException e) {
			System.out.println(e.getStatus().getDescription());
			throw new RuntimeException(e.getStatus().getDescription());
		}
		finally {
			appointmentBlockingStub = null;
		}

		System.out.println(appointmentObjFromServer.getId());  //here getId() instead of getName()
		Appointment realObj = getAppointment(appointmentObjFromServer);
		System.out.println(realObj.getAppointmentId());
		return realObj;


	}

	@Override
	public Optional<List<Appointment>> getAppointmentsByDateDoctor(String date, int id) {
		RequestFindAppointmentsForDoctorObj requestObj = RequestFindAppointmentsForDoctorObj.newBuilder()
				.setDate(date)
				.setId(id)
				.build();
		AppointmentList returnedAppointments;
		try{
			returnedAppointments = getAppointmentBlockingStub().findAppointmentsForDoctor(requestObj);
		}
		catch (StatusRuntimeException e) {
			System.out.println(e.getStatus().getDescription());
			throw new RuntimeException(e.getStatus().getDescription());
		}
		finally {
			appointmentBlockingStub = null;
		}
		List<Appointment> realObj = new ArrayList<Appointment>();

		List<AppointmentObj> objList = returnedAppointments.getAppointmentsList();
		for (AppointmentObj obj: objList) {
			realObj.add(this.getAppointment(obj));
		}

		return Optional.of(realObj);

	}

	private Appointment getAppointment(AppointmentObj appointmentObjFromServer) {
		Appointment returnedAppointment = new Appointment();
		returnedAppointment.setAppointmentId(appointmentObjFromServer.getId());
		returnedAppointment.setPatientId(appointmentObjFromServer.getPatientId());
		returnedAppointment.setDoctorId(appointmentObjFromServer.getDoctorId());
		returnedAppointment.setDate(appointmentObjFromServer.getDate());
		returnedAppointment.setTime(appointmentObjFromServer.getTime());
		returnedAppointment.setDiagnosis(appointmentObjFromServer.getDiagnosis());
		returnedAppointment.setStatus(appointmentObjFromServer.getStatus());
		return returnedAppointment;
	}
}

