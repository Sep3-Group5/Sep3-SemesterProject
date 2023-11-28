namespace Domain.Models;

public class Booking
{
    public int Id { get; set; }
    public int PatientId {get; set;}
    public int DoctorId {get; set;}
    public string Date {get; set;}
    public string Time {get; set;}
    
    public Booking (int id, int patientId, int doctorId, string date, string time)
    {
        if (!(time.EndsWith("00") || time.EndsWith("30")))
        {
            throw new Exception("Booking time must be at a full or half-hour");
        }

        Id = id;
        PatientId = patientId;
        DoctorId = doctorId;
        Date = date;
        Time = time;
    }

    public Booking()
    {
        
    }
}
