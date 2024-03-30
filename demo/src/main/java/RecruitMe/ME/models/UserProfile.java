package RecruitMe.ME.models;

import java.util.Date;
import java.util.List;


public class UserProfile {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String username;
    private String password;

    private String phoneNumber;
    private Address address;

    private Date dateOfBirth;
    private String gender;
    private String nationality;
    private List<String> spokenLanguages;

    private List<EmploymentHistory> employmentHistory;
    private List<String> technicalSkills;
    private List<String> softSkills;
    private EducationBackground educationBackground;
    private List<String> desiredJobTitles;
    private List<String> preferredWorkLocations;
    private double expectedSalaryMin;
    private double expectedSalaryMax;
    private Availability availability;

    public UserProfile(
            String firstName,
            String lastName,
            String emailAddress,
            String username,
            String password,
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
            List<String> desiredJobTitles,
            List<String> preferredWorkLocations,
            double expectedSalaryMin,
            double expectedSalaryMax,
            Availability availability
    ) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.emailAddress = emailAddress;
       this.username = username;
       this.password = password;
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
       this.desiredJobTitles = desiredJobTitles;
       this.preferredWorkLocations = preferredWorkLocations;
       this.expectedSalaryMax = expectedSalaryMax;
       this.expectedSalaryMin = expectedSalaryMin;
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

    public double getExpectedSalaryMax() {
        return expectedSalaryMax;
    }

    public double getExpectedSalaryMin() {
        return expectedSalaryMin;
    }

    public EducationBackground getEducationBackground() {
        return educationBackground;
    }

    public List<String> getDesiredJobTitles() {
        return desiredJobTitles;
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

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public List<String> getPreferredWorkLocations() {
        return preferredWorkLocations;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public void setDesiredJobTitles(List<String> desiredJobTitles) {
        this.desiredJobTitles = desiredJobTitles;
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

    public void setExpectedSalaryMax(double expectedSalaryMax) {
        this.expectedSalaryMax = expectedSalaryMax;
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

    public void setPassword(String password) {
        this.password = password;
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
}
