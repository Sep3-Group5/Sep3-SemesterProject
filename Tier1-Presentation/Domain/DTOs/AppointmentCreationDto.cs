namespace Domain.DTOs;

public class AppointmentCreationDto
{
    public int Id { get; set; }
    public int PatientId { get; set; }
    public int DoctorId { get; set; }
    public string Diagnostic { get; set; }
    public bool Status { get; set; }
    public string Date { get; set; }
    public string Time { get; set; }

    public AppointmentCreationDto(int id, int patientId, int doctorId, string date, string time)
    {
        Id = id;
        PatientId = patientId;
        DoctorId = doctorId;
        Date = date;
        Time = time;
        Status = false;
    }
}