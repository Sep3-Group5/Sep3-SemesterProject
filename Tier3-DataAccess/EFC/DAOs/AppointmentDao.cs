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
        IQueryable<Appointment> bookingsQuery = context.Bookings.Where(b =>
            b.DoctorId == appointment.DoctorId && b.PatientId == appointment.PatientId && b.Date.Equals(appointment.Date) &&
            b.Time.Equals(appointment.Time));
        IEnumerable<Appointment> bookings = await bookingsQuery.ToListAsync();
        if (bookings.Any())
        {
            throw new Exception("Appointment with those details already exists");
        }

        EntityEntry<Appointment> newBooking = await context.Bookings.AddAsync(appointment);
        await context.SaveChangesAsync();
        return newBooking.Entity;
    }

    public async Task<IEnumerable<Appointment>> GetAsync()
    {
        IQueryable<Appointment> appointmentsQuery = context.Bookings.AsQueryable();
        List<Appointment> appointments = await appointmentsQuery.ToListAsync();
        return appointments;
    }

    public async Task<Appointment?> GetAsync(int id)
    {
        Appointment? booking = await context.Bookings.FindAsync(id);
        if (booking == null)
        {
            throw new Exception($"No appointment with id {id}");
        }
        return booking;
    }

    public async Task<Appointment?> GetAsync(string date, string time)
    {
        IQueryable<Appointment?> bookingsQuery =
            context.Bookings.AsQueryable().Where(b => b.Date.Equals(date) && b.Time.Equals(time));
        IEnumerable<Appointment?> bookings = await bookingsQuery.ToListAsync();
        Appointment? booking = bookings.FirstOrDefault();
        return booking;
    }

    public async Task UpdateAsync(Appointment appointment)
    {
        Appointment? existing = await GetAsync(appointment.Id);
        if (existing == null)
        {
            throw new Exception($"No Appointment with id: {appointment.Id}");
        }
        context.Bookings.Update(appointment);
        await context.SaveChangesAsync();
    }

    public async Task DeleteAsync(int id)
    {
        Appointment? existing = await GetAsync(id);
        if (existing == null)
        {
            throw new Exception($"No Appointment with id: {id}");
        }

        context.Bookings.Remove(existing);
        await context.SaveChangesAsync();
    }
}