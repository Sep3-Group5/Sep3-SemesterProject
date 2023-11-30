package via.sdj3.proofofconcept_v3.entity;

import jakarta.persistence.*;

@Entity
public class Appointment {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appointmentId;

	@Column
	private int doctorId;

	@Column
	private int patientId;

	@Column
	private String date;

	@Column
	private String time;

	@Column
	private String diagnosis;

	@Column
	private boolean status;

	public Appointment(int doctorId, int patientId, String date, String time, String diagnosis) {
		this.doctorId = doctorId;
		this.patientId = patientId;
		this.date = date;
		this.time = time;
		this.diagnosis = diagnosis;
	}

	public Appointment() {
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean getStatus(){return status;}
}
