namespace Domain.DTOs;

public class PatientCreationDto
{
<<<<<<< Updated upstream
    public int Id { get; }
    public string Fullname { get; }
    public string Username { get; }
    public string Password { get; }

    public PatientCreationDto(int id, string fullname, string username, string password)
    {
	    Id = id;
	    Fullname = fullname;
	    Username = username;
	    Password = password;
    }

    public PatientCreationDto()
    {
    }
=======
	public int Id { get; set; }
	public string Fullname { get; set; }
	public string Username { get; set; }
	public string Password { get; set; }


	public PatientCreationDto(int id, string fullname, string username, string password)
	{
		Id = id;
		Fullname = fullname;
		Username = username;
		Password = password;
	}

	public PatientCreationDto()
	{
	}

>>>>>>> Stashed changes
}
