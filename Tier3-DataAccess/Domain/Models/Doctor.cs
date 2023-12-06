namespace Domain.Models;

public class Doctor
{
    public int Id { get; set; }
    public string Username { get; set; }
    public string Password { get; set; }
    public string Fullname { get; set; }
    public string? Specialization { get; set; }
    public bool Validated { get; set; }

    public Doctor(int id, string username, string password, string fullname, string? specialization, bool validated)
    {
        Id = id;
        Username = username;
        Password = password;
        Fullname = fullname;
        Specialization = specialization;
        Validated = validated;
    }

    public Doctor()
    {

    }
}
