using Domain.Models;

namespace EFC.DAOs;

public interface IBookingDao
{
    Task<Booking?> CreateAsync(Booking booking);
    Task<Booking?> GetAsync(int id);
    Task<Booking?> GetAsync(string date, string time);
    Task UpdateAsync(Booking booking);
    Task DeleteAsync(int id);
}