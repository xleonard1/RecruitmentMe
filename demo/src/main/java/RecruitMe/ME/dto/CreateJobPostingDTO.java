package RecruitMe.ME.dto;

import RecruitMe.ME.models.EmploymentType;
import RecruitMe.ME.models.JobStatus;
import java.util.Date;
import java.util.List;

public class CreateJobPostingDTO {
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
    private String clientProfileId;

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
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getLocation() {
        return location;
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
    public String getClientId(){
        return clientProfileId;
    }
    public void setClientId(String clientProfileId) {
        this.clientProfileId = clientProfileId;
    }


}
