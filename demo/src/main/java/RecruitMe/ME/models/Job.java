package RecruitMe.ME.models;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

public class Job {
    @Id
    private String jobId;
    private String jobTitle;
    private String jobDescription;
    private String companyName;
    private String location;
    private List<String> topThreeSkills;
    private List<String> niceToHaves;
    private String salaryRange;
    private String educationalRequirements;
    private Date jobPostedDate;
    private String industry;
    private EmploymentType employmentType;

    private JobStatus jobStatus;
    private String clientId;
    private List<JobApplicant> applicants;


    public Job(){

    }

    public Job(
            String jobTitle,
            String jobDescription,
            String companyName,
            String location,
            List<String> topThreeSkills,
            String salaryRange,
            String educationalRequirements,
            Date jobPostedDate,
            String industry,
            EmploymentType employmentType,
            JobStatus jobStatus,
            List<String> niceToHaves,
            List<JobApplicant> applicants
    ) {
            this.jobTitle = jobTitle;
            this.jobDescription = jobDescription;
            this.companyName = companyName;
            this.location = location;
            this.topThreeSkills = topThreeSkills;
            this.salaryRange = salaryRange;
            this.educationalRequirements = educationalRequirements;
            this.jobPostedDate = jobPostedDate;
            this.industry = industry;
            this.employmentType = employmentType;
            this.jobStatus = jobStatus;
            this.niceToHaves = niceToHaves;
            this.applicants = applicants;
    }
    public String getJobId() {
        return jobId;
    }
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public String jobDescription() {
        return jobDescription;
    }
    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
    public String companyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public List<String> getTopThreeSkills() {
        return topThreeSkills;
    }
    public void setTopThreeSkills(List<String> topThreeSkills) {
        this.topThreeSkills = topThreeSkills;
    }
    public String getSalaryRange() {
        return salaryRange;
    }
    public void setSalaryRange(String salaryRange) {
        this.salaryRange = salaryRange;
    }
    public String getEducationalRequirements() {
        return educationalRequirements;
    }
    public void setEducationalRequirements(String educationalRequirements) {
        this.educationalRequirements = educationalRequirements;
    }
    public Date getJobPostedDate() {
        return jobPostedDate;
    }
    public void setJobPostedDate(Date jobPostedDate) {
        this.jobPostedDate = jobPostedDate;
    }
    public String getIndustry() {
        return industry;
    }
    public void setIndustry(String industry) {
        this.industry = industry;
    }
    public JobStatus getJobStatus() {
        return jobStatus;
    }
    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus;
    }
    public List<String> getNiceToHaves() {
        return niceToHaves;
    }
    public void setNiceToHaves(List<String> niceToHaves) {
        this.niceToHaves = niceToHaves;
    }
    public EmploymentType getEmploymentType(){
        return employmentType;
    }
    public void setEmploymentType(EmploymentType employmentType){
        this.employmentType = employmentType;
    }
    public String getClientId() {
        return clientId;
    }
    public void setClientId(String clientId){
        this.clientId = clientId;
    }
    public List<JobApplicant> getApplicants() {
        return this.applicants;
    }
    public void setApplicants(List<JobApplicant> applicants ){
        this.applicants = applicants;
    }

}
