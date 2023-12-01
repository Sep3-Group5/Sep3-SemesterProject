namespace Domain.DTOs;

public class RegisterPatientDto
{
    private string UserName { get; set; }
    private string Password { get; set; }

    public RegisterPatientDto(string name, string password)
    {
        UserName = name;
        Password = password;
    }
}