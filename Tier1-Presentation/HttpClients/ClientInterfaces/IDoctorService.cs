using Domain.Models;

namespace HttpClients.ClientInterfaces;

public interface IDoctorService
{
    Task<IEnumerable<Doctor>> GetDoctorsAsync(string? usernameContains = null);
}