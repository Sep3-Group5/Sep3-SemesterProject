package via.sdj3.proofofconcept_v3.Dto;

public class RegisterPatientDto {
    private String UserName;
    private String Password;

    public RegisterPatientDto(String name, String password) {
        this.UserName = name;
        this.Password = password;
    }

    public String getName() {
        return UserName;
    }

    public void setName(String name) {
        this.UserName = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
}
