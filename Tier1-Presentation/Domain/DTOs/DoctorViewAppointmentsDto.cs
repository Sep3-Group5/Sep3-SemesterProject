using Domain.Models;

namespace Domain.DTOs;

public class DoctorViewAppointmentsDto
{
    public List<Appointment> Appointments { get; set; }
    public string Date { get; set; }
}