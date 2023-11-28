using System.Collections;
using Domain.Models;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.ChangeTracking;

namespace EFC.DAOs;

public class BookingDao : IBookingDao
{
    private readonly Context context;

    public BookingDao(Context context)
    {
        this.context = context;
    }

    public async Task<Booking?> CreateAsync(Booking booking)
    {
        IQueryable<Booking> bookingsQuery = context.Bookings.Where(b =>
            b.DoctorId == booking.DoctorId && b.PatientId == booking.PatientId && b.Date.Equals(booking.Date) &&
            b.Time.Equals(booking.Time));
        IEnumerable<Booking> bookings = await bookingsQuery.ToListAsync();
        if (bookings.Any())
        {
            throw new Exception("Booking with those details already exists");
        }

        EntityEntry<Booking> newBooking = await context.Bookings.AddAsync(booking);
        await context.SaveChangesAsync();
        return newBooking.Entity;
    }

    public async Task<Booking?> GetAsync(int id)
    {
        Booking? booking = await context.Bookings.FindAsync(id);
        if (booking == null)
        {
            throw new Exception($"No booking with id {id}");
        }
        return booking;
    }

    public async Task<Booking?> GetAsync(string date, string time)
    {
        IQueryable<Booking?> bookingsQuery =
            context.Bookings.AsQueryable().Where(b => b.Date.Equals(date) && b.Time.Equals(time));
        IEnumerable<Booking?> bookings = await bookingsQuery.ToListAsync();
        Booking? booking = bookings.FirstOrDefault();
        return booking;
    }

    public async Task UpdateAsync(Booking booking)
    {
        Booking? existing = await GetAsync(booking.Id);
        if (existing == null)
        {
            throw new Exception($"No Booking with id: {booking.Id}");
        }
        context.Bookings.Update(booking);
        await context.SaveChangesAsync();
    }

    public async Task DeleteAsync(int id)
    {
        Booking? existing = await GetAsync(id);
        if (existing == null)
        {
            throw new Exception($"No Booking with id: {id}");
        }

        context.Bookings.Remove(existing);
        await context.SaveChangesAsync();
    }
}