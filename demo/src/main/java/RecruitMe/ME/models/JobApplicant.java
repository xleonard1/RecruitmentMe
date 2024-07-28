package RecruitMe.ME.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobApplicant {
    private String applicantId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private Date dateOfBirth;
    private String gender;
    private String nationality;
    private List<String> spokenLanguages;
    private List<EmploymentHistory> employmentHistory;
    private List<String> technicalSkills;
    private List<String> softSkills;
    private EducationBackground educationBackground;
    private List<String> preferredWorkLocations;
    private double expectedSalaryMin;
    private Availability availability;
    private String phoneNumber;
    private Address address;

    public JobApplicant() {
        // default job applicant
    }

    public JobApplicant(
            String firstName,
            String lastName,
            String emailAddress,
            String phoneNumber,
            Address address,
            Date dateOfBirth,
            String gender,
            String nationality,
            List<String> spokenLanguages,
            List<EmploymentHistory> employmentHistory,
            List<String> technicalSkills,
            List<String> softSkills,
            EducationBackground educationBackground,
            List<String> preferredWorkLocations,
            double expectedSalaryMin,
            Availability availability
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.spokenLanguages = spokenLanguages;
        this.employmentHistory = employmentHistory;
        this.technicalSkills = technicalSkills;
        this.softSkills = softSkills;
        this.educationBackground = educationBackground;
        this.preferredWorkLocations = preferredWorkLocations;
        this.expectedSalaryMin = expectedSalaryMin;
        this.availability = availability;
    }

    public Address getAddress() {
        return address;
    }

    public Availability getAvailability() {
        return availability;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }


    public double getExpectedSalaryMin() {
        return expectedSalaryMin;
    }

    public EducationBackground getEducationBackground() {
        return educationBackground;
    }


    public List<EmploymentHistory> getEmploymentHistory() {
        return employmentHistory;
    }

    public List<String> getSoftSkills() {
        return softSkills;
    }

    public List<String> getSpokenLanguages() {
        return spokenLanguages;
    }

    public List<String> getTechnicalSkills() {
        return technicalSkills;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getApplicantId() {
        return applicantId;
    }

    public List<String> getPreferredWorkLocations() {

        return preferredWorkLocations;
    }

    public void setNationality(String nationality) {

        this.nationality = nationality;
    }

    public void setAddress(Address address) {

        this.address = address;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public void setDateOfBirth(Date dateOfBirth) {

        this.dateOfBirth = dateOfBirth;
    }

    public void setEducationBackground(EducationBackground educationBackground) {
        this.educationBackground = educationBackground;
    }

    public void setEmailAddress(String emailAddress) {

        this.emailAddress = emailAddress;
    }

    public void setEmploymentHistory(List<EmploymentHistory> employmentHistory) {
        this.employmentHistory = employmentHistory;
    }

    public void setExpectedSalaryMin(double expectedSalaryMin) {

        this.expectedSalaryMin = expectedSalaryMin;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public void setPreferredWorkLocations(List<String> preferredWorkLocations) {
        this.preferredWorkLocations = preferredWorkLocations;
    }

    public void setSoftSkills(List<String> softSkills) {

        this.softSkills = softSkills;
    }

    public void setSpokenLanguages(List<String> spokenLanguages) {

        this.spokenLanguages = spokenLanguages;
    }

    public void setTechnicalSkills(List<String> technicalSkills) {
        this.technicalSkills = technicalSkills;
    }
    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }


}

