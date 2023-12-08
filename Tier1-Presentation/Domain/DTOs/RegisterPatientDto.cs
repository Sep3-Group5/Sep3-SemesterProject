namespace Domain.DTOs;

public class RegisterPatientDto
{
    private string Name { get; set; }
    private string UserName { get; set; }
    private string Password { get; set; }

    public RegisterPatientDto(string name, string username, string password)
    {
        Name = name;
        UserName = username;
        Password = password;
    }
}