using System.Collections;
using Domain.Models;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.ChangeTracking;

namespace EFC.DAOs;

public class AppointmentDao : IAppointmentDao
{
    private readonly Context context;

    public AppointmentDao(Context context)
    {
        this.context = context;
    }

    public async Task<Appointment?> CreateAsync(Appointment appointment)
    {
        IQueryable<Appointment> appointmentQuery = context.Appointments.Where(a => a.Id == appointment.Id &&
            a.DoctorId == appointment.DoctorId && a.PatientId == appointment.PatientId && a.Date.Equals(appointment.Date) &&
            a.Time.Equals(appointment.Time) && a.Diagnosis.Equals(appointment.Diagnosis) && a.Status == appointment.Status);
        IEnumerable<Appointment> bookings = await appointmentQuery.ToListAsync();
        if (bookings.Any())
        {
            throw new Exception("Appointment with those details already exists");
        }

        EntityEntry<Appointment> newAppointment = await context.Appointments.AddAsync(appointment);
        await context.SaveChangesAsync();
        return newAppointment.Entity;
    }

    public async Task<IEnumerable<Appointment>> GetAsync()
    {
        IQueryable<Appointment> appointmentsQuery = context.Appointments.AsQueryable();
        List<Appointment> appointments = await appointmentsQuery.ToListAsync();
        return appointments;
    }

    public async Task<Appointment?> GetAsync(int id)
    {
        Appointment? appointment = await context.Appointments.FindAsync(id);
        if (appointment == null)
        {
            throw new Exception($"No appointment with id {id}");
        }
        return appointment;
    }

    public async Task<Appointment?> GetAsync(string date, string time)
    {
        IQueryable<Appointment?> bookingsQuery =
            context.Appointments.AsQueryable().Where(a => a.Date.Equals(date) && a.Time.Equals(time));
        IEnumerable<Appointment?> appointments = await bookingsQuery.ToListAsync();
        Appointment? appointment = appointments.FirstOrDefault();
        return appointment;
    }

    public async Task UpdateAsync(Appointment appointment)
    {
        Appointment? existing = await GetAsync(appointment.Id);
        if (existing == null)
        {
            throw new Exception($"No Appointment with id: {appointment.Id}");
        }
        context.Appointments.Update(appointment);
        await context.SaveChangesAsync();
    }

    public async Task DeleteAsync(int id)
    {
        Appointment? existing = await GetAsync(id);
        if (existing == null)
        {
            throw new Exception($"No Appointment with id: {id}");
        }

        context.Appointments.Remove(existing);
        await context.SaveChangesAsync();
    }
}
