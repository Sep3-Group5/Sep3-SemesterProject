using Domain.Models;

namespace EFC.DAOs;

public interface IDoctorDao
{
    Task<Doctor?> CreateAsync(Doctor doctor);
    Task<Doctor?> GetAsync(int id);
    Task UpdateAsync(Doctor doctor);
    Task DeleteAsync(int id);
}