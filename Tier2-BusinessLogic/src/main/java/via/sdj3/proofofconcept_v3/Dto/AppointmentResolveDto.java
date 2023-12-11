package via.sdj3.proofofconcept_v3.Dto;

public class AppointmentResolveDto {
    private final int id;
    private String diagnosis;
    private boolean status;

    public AppointmentResolveDto(int id, String diagnosis, boolean status) {
        this.id = id;
        this.diagnosis = diagnosis;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}