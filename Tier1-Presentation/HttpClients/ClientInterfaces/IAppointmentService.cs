using Domain.DTOs;
using Domain.Models;

namespace HttpClients.ClientInterfaces;

public interface IAppointmentService
{
    Task<Appointment> CreateAsync(AppointmentCreationDto dto);




    Task<List<Appointment>> getAppointmentsByDateDoctor(DoctorViewAppointmentsDto dto, String jwt);
    Task<ICollection<Appointment>> GetAsync(int appointmentId, int patientId, int doctorId, string diagnostic, bool status, string date, string time);
}