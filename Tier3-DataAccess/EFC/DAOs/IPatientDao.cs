using Domain.DTOs;
using Domain.Models;

namespace EFC.DAOs;

public interface IPatientDao
{
    Task<Patient?> CreateAsync(Patient patient);
    Task<IEnumerable<Patient>> GetAsync(PatientSearchDto dto);
    Task<Patient?> GetAsync(int id);
    Task UpdateAsync(Patient patient);
    Task DeleteAsync(int id);
}