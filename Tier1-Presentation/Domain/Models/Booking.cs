namespace Domain.Models;

public class Booking
{
    public int Id { get; set; }
    public int PatientId { get; set; }
    public string Description { get; set; }
    public string Diagnostic { get; set; }
    public bool Status { get; set; }
    public DateTime Time { get; set; }
}