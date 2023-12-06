namespace Domain.Models;

public class Patient
{
<<<<<<< Updated upstream
	public int Id { get; set; }
	public string Fullname { get; set; }
	public string Username { get; set; }
	public string Password { get; set; }

	public Patient(int id, string fullname, string username, string password)
	{
		Id = id;
		Fullname = fullname;
		Username = username;
		Password = password;
	}

	public Patient()
	{
	}
=======
    public int Id { get; set; }
    public string Fullname { get; set; }
    public string Username { get; set; }
    public string Password { get; set; }


    public Patient(int id, string fullname, string username, string password)
    {
        Id = id;
        Fullname = fullname;
        Username = username;
        Password = password;
    }

    public Patient()
    {
    }
>>>>>>> Stashed changes
}
