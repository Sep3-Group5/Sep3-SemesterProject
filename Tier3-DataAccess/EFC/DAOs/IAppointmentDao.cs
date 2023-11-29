using Domain.Models;

namespace EFC.DAOs;

public interface IAppointmentDao
{
    Task<Appointment?> CreateAsync(Appointment appointment);
    Task<Appointment?> GetAsync(int id);
    Task<Appointment?> GetAsync(string date, string time);
    Task UpdateAsync(Appointment appointment);
    Task DeleteAsync(int id);
}