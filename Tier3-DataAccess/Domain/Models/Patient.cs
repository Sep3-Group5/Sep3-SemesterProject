﻿namespace Domain.Models;

public class Patient
{
    public int Id { get; set; }
    public string Name { get; set; }
    
    public Patient(int id, string name)
    {
        Id = id;
        Name = name;
    }

    public Patient()
    {
    }
}