namespace Domain.DTOs;

public class PatientCreationDto
{
    public int Id { get; }
    public string Name { get; }
    public string Username { get; }
    public string Password { get; }

    public PatientCreationDto(int Id, string Name, string Username, string Password)
    {
        this.Id = Id;
        this.Name = Name;
        this.Username = Username;
        this.Password = Password;
    }

}