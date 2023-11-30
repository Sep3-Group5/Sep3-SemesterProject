using System.Data;
using System.Net.Http.Json;
using System.Text.Json;
using Domain.DTOs;
using Domain.Models;
using HttpClients.ClientInterfaces;

namespace HttpClients.Implementations;

public class BookingHttpClient : IBookingService
{
    private readonly HttpClient client;

    public BookingHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<Booking> CreateAsync(BookingCreationDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("http://localhost:8989/bookings/test", dto);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        Booking booking = JsonSerializer.Deserialize<Booking>(result);
        return booking;
    }
}