using System.Security.Claims;


namespace BlazorWasm.Services;

public interface IAuthService
{
    public Task LoginDoctorAsync(string username, string password);
    public Task LoginPatientAsync(string username, string password);
    public Task LogoutAsync();
    public Task RegisterPatientAsync(User user);
    public Task RegisterDoctorAsync(User user);
    public Task<ClaimsPrincipal> GetAuthAsync();

    public Action<ClaimsPrincipal> OnAuthStateChanged { get; set; }
}