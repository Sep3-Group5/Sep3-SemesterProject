namespace Domain.Models;

public class Patient
{
    public int Id { get; private set; }
    public string Name { get; private set; }
    
    public Patient(int id, string name)
    {
        Id = id;
        Name = name;
    }

    private Patient()
    {
    }
}