using Domain.DTOs;
using Domain.Models;

namespace HttpClients.ClientInterfaces;

public interface IAppointmentService
{
    Task<Appointment> CreateAsync(AppointmentCreationDto dto);




    Task<List<Appointment>> getAppointmentsByDateDoctor(DoctorViewAppointmentsDto dto);
}