package RecruitMe.ME.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "ClientProfile")
public class ClientProfile {
    @Id
    private String id;
    private String clientPassword;
    private String clientEmail;
    private String clientUsername;
    private String companyDescription;
    private int numberOfEmployees;
    private ArrayList<Job> jobs;
    private List<String> companyStories;
    private String userId;
    private List<UserProfile> applicants;
    public ClientProfile() {
       // initial constructor
   }

   public ClientProfile(
           String clientPassword,
           String clientEmail,
           String clientUsername,
           String companyDescription,
           int numberOfEmployees,
           List<String> companyStories,
           ArrayList<Job> jobs,
           List<UserProfile> applicants
   ) {
       this.companyDescription = companyDescription;
       this.companyStories = companyStories;
       this.numberOfEmployees = numberOfEmployees;
       this.clientPassword = clientPassword;
       this.clientEmail = clientEmail;
       this.clientUsername = clientUsername;
       this.jobs = jobs;
       this.applicants = applicants;
   }

   public String getId() {
        return id;
   }

   public void setClientId(String clientId) {
        this.id = clientId;
   }

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

   public String getUserId() {
        return userId;
   }

   public void setUserId(String userId) {
        this.userId = userId;
   }

   public List<Job> getJobs() {
       return jobs;
   }

   public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
   }
    public void addJob(Job job) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>(); // Initialize the list if it's null
        }
        this.jobs.add(job);
    }

    public List<UserProfile> getApplicants(){
        return applicants;
    }
    public void setApplicants(List<UserProfile> applicants) {
        this.applicants = applicants;
    }

}