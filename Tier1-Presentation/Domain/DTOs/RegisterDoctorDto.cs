namespace Domain.DTOs;

public class RegisterDoctorDto
{
    public string Username { get; }
    public string Password { get; }
    public string FullName { get; }
    public string Specialization { get; }

    public RegisterDoctorDto(string username, string password, string fullName, string specialization)
    {
        Username = username;
        Password = password;
        FullName = fullName;
        Specialization = specialization;
    }
}