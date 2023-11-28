namespace Domain.DTOs;

public class RegisterPatientDto
{
    private string Name { get; set; }
    private string Password { get; set; }

    public RegisterPatientDto(string name, string password)
    {
        Name = name;
        Password = password;
    }
}