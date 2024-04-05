package RecruitMe.ME.dto;

import java.util.List;

public class UpdateClientProfileDTO {
    private String password;
    private String username;
    private String email;
    private List<String> clientStories;
    private String companyDescription;
    private int numberOfEmployees;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getClientStories(){
        return clientStories;
    }
    public void setClientStories(List<String> clientStories) {
        this.clientStories = clientStories;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }
    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }
    public int getNumberOfEmployees(){
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

}
