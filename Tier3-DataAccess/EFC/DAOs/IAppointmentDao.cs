using Domain.Models;

namespace EFC.DAOs;

public interface IAppointmentDao
{
    Task<Appointment?> CreateAsync(Appointment appointment);
    Task<IEnumerable<Appointment>> GetAsync();
    Task<Appointment?> GetAsync(int id);
    Task<Appointment?> GetAsync(string date, string time);
    Task UpdateAsync(Appointment appointment);
    Task DeleteAsync(int id);
    Task<List<Appointment>> GetDoctorAppoitmentsByDateAndId(int id, string date);
    Task UpdateStatusDiagnosis(int id, bool status, string diagnosis);
}