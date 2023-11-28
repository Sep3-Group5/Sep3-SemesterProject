﻿using Domain.Models;
using Microsoft.EntityFrameworkCore;

namespace EFC;

public class Context : DbContext
{
    public DbSet<Patient> Patients { get; set; }
    public DbSet<Doctor> Doctors { get; set; }
    public DbSet<Booking> Bookings { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder builder)
    {
        builder.UseSqlite("Data Source = ../EFC/Hospital.db");
        builder.UseQueryTrackingBehavior(QueryTrackingBehavior.NoTracking);
    }
    
    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.Entity<Patient>().HasKey(patient => patient.Id);
        modelBuilder.Entity<Doctor>().HasKey(doctor => doctor.Id);
        modelBuilder.Entity<Booking>().HasKey(booking => booking.Id);
    }
}