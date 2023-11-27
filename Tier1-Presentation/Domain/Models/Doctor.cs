namespace Domain.Models;

public class Doctor
{
    public int Id { get; }
    public string Username { get; }
    public string Password { get; }
    public string FullName { get; }
    public string Specialization { get; }
    public int Validated { get; }

    public Doctor(int id, string username, string password, string fullName, string specialization, int validated)
    {
        this.Id = id;
        this.Username = username;
        this.Password = password;
        this.FullName = fullName;
        this.Specialization = specialization;
        this.Validated = validated;
    }
}