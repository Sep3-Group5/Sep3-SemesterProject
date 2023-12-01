package via.sdj3.proofofconcept_v3.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegisterPatientDto {
    @JsonProperty("UserName")
    private String UserName;
    @JsonProperty("Password")
    private String Password;

    public RegisterPatientDto(String name, String password) {
        this.UserName = name;
        this.Password = password;
    }

    public RegisterPatientDto() {
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
