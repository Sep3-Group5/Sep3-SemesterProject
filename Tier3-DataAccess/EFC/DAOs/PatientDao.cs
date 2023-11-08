using Domain.DTOs;
using Domain.Models;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.ChangeTracking;

namespace EFC.DAOs;

public class PatientDao : IPatientDao
{
    private readonly Context context;

    public PatientDao(Context context)
    {
        this.context = context;
    }
    
    public async Task<Patient> CreateAsync(Patient patient)
    {
        EntityEntry<Patient> newPatient = await context.Patients.AddAsync(patient);
        await context.SaveChangesAsync();
        return newPatient.Entity;
    }

    public async Task<IEnumerable<Patient>> GetAsync(PatientSearchDto dto)
    {
        IQueryable<Patient> patientsQuery = context.Patients.AsQueryable(); 
        if (dto.NameContains != null)
        {
            patientsQuery = patientsQuery.Where(p => p.Name.ToLower().Contains(dto.NameContains.ToLower()));
        }

        IEnumerable<Patient> result = await patientsQuery.ToListAsync();
        return result;
    }

    public async Task<Patient?> GetAsync(int id)
    {
        Patient? patient = await context.Patients.FindAsync(id);
        return patient;
    }

    public async Task UpdateAsync(Patient patient)
    {
        context.Patients.Update(patient);
        await context.SaveChangesAsync();
    }

    public async Task DeleteAsync(int id)
    {
        Patient? existing = await GetAsync(id);
        if (existing == null)
        {
            throw new Exception($"No Patient with id: {id}");
        }

        context.Patients.Remove(existing);
        await context.SaveChangesAsync();
    }
}