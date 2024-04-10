package RecruitMe.ME.dto;

import RecruitMe.ME.models.Job;

import java.util.ArrayList;
import java.util.List;

public class UpdateClientProfileDTO {
    private String clientPassword;
    private String clientUsername;
    private String clientEmail;
    private List<String> companyStories;
    private String companyDescription;
    private int numberOfEmployees;
    private ArrayList<Job> jobs;

    public String getClientPassword() {
        return clientPassword;
    }

    public void setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
    }
    public String getClientEmail(){
        return clientEmail;
    }
    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientUsername(){
        return clientUsername;
    }

    public void setClientUsername(String clientUsername) {
        this.clientUsername = clientUsername;
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

    public List<String> getCompanyStories() {
        return companyStories;
    }

    public void setCompanyStories(List<String> companyStories) {
        this.companyStories = companyStories;
    }

    public ArrayList<Job> getJobs() {
        return jobs;
    }
    public void setJobs (ArrayList<Job> jobs){
        this.jobs = jobs;
    }


}
