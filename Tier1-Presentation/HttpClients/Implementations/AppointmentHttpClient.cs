using System.Data;
using System.Net.Http.Json;
using System.Text.Json;
using Domain.DTOs;
using Domain.Models;
using HttpClients.ClientInterfaces;

namespace HttpClients.Implementations;

public class AppointmentHttpClient : IAppointmentService
{
    private readonly HttpClient client;
    
    private String url ="http://localhost:8989/"; 

    public AppointmentHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<Appointment> CreateAsync(AppointmentCreationDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync(url+"appointments", dto);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        Appointment appointment = JsonSerializer.Deserialize<Appointment>(result);
        return appointment;
    }

    public async Task<List<Appointment>> getAppointmentsByDateDoctor(DoctorViewAppointmentsDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync(url + "Doctor/Appointments", dto);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        List<Appointment> appointments = JsonSerializer.Deserialize<List<Appointment>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        });
        return appointments;
    }
}