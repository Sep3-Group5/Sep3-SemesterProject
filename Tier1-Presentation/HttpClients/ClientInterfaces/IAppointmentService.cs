using Domain.DTOs;
using Domain.Models;

namespace HttpClients.ClientInterfaces;

public interface IAppointmentService
{
    Task<Appointment> CreateAsync(AppointmentCreationDto dto);
    Task UpdateAsync(AppointmentResolveDto dto);
    Task<Appointment> GetByIdAsync(int id);
    Task<List<Appointment>> getAppointmentsByDateDoctor(DoctorViewAppointmentsDto dto, String jwt);
    Task<ICollection<Appointment>> GetAsync(int patientId);
}
