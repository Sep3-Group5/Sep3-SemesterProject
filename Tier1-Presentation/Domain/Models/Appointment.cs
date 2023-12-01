namespace Domain.Models;

public class Appointment
{
    public int Id { get; set; }
    public int PatientId { get; set; }
    public int DoctorId { get; set; }
    public string Diagnostic { get; set; }
    public bool Status { get; set; }
    public string Date { get; set; }
    public string Time { get; set; }
}