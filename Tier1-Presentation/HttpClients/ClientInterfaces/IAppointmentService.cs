using Domain.DTOs;
using Domain.Models;

namespace HttpClients.ClientInterfaces;

public interface IAppointmentService
{
    Task<Appointment> CreateAsync(AppointmentCreationDto dto);
    Task<List<Appointment>> getAppointmentsByDateDoctor(DoctorViewAppointmentsDto dto, String jwt);
    Task<List<Appointment>> getAppointmentsByDatePatient(PatientViewAppointmentsDto dto, String jwt);
    Task<ICollection<Appointment>> GetAsync(int patientId);
}
