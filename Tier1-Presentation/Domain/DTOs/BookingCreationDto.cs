namespace Domain.DTOs;

public class BookingCreationDto
{
    public int Id { get; set; }
    public int PatientId { get; set; }
    public string Description { get; set; }
    public string Diagnostic { get; set; }
    public bool Status { get; set; }
    public DateTime Time { get; set; }

    public BookingCreationDto(int ownerId, string description, DateTime time)
    {
        this.PatientId = ownerId;
        this.Description = description;
        this.Time = time;
    }
}