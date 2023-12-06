namespace Domain.Models;

public class Doctor
{
    public int Id { get; set; }
    public string Username { get; set; }
    public string Password { get; set; }
<<<<<<< Updated upstream
    public string Fullname { get; set; }
    public string? Specialization { get; set; }
    public bool Validated { get; set; }

    public Doctor(int id, string username, string password, string fullname, string? specialization, bool validated)
=======
    public string FullName { get; set; }
    public string Specialization { get; set; }
    public bool Validated { get; set; }

    public Doctor(int id, string username, string password, string fullName, string specialization, bool validated)
>>>>>>> Stashed changes
    {
        Id = id;
        Username = username;
        Password = password;
<<<<<<< Updated upstream
        Fullname = fullname;
=======
        FullName = fullName;
>>>>>>> Stashed changes
        Specialization = specialization;
        Validated = validated;
    }

    public Doctor()
    {

    }
}
