using Domain.DTOs;
using Domain.Models;

namespace HttpClients.ClientInterfaces;

public interface IBookingService
{
    Task<Booking> CreateAsync(BookingCreationDto dto);
}