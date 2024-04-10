package RecruitMe.ME.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
    private List<Job> jobs;
    private List<String> companyStories;
    private String userId;
    public ClientProfile() {
       // initial constructor
   }

   public ClientProfile(String clientPassword, String clientEmail, String clientUsername, String companyDescription, int numberOfEmployees, List<String> companyStories) {
       this.companyDescription = companyDescription;
       this.companyStories = companyStories;
       this.numberOfEmployees = numberOfEmployees;
       this.clientPassword = clientPassword;
       this.clientEmail = clientEmail;
       this.clientUsername = clientUsername;
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
   public void setJobs (List<Job> jobs){
        this.jobs = jobs;
   }


}