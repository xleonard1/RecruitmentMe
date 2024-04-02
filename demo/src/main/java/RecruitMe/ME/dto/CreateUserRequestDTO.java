package RecruitMe.ME.dto;

import RecruitMe.ME.models.*;

import java.util.Date;
import java.util.List;

public class CreateUserRequestDTO {
    private String username;
    private String email;
    private String password;
    private Role role;

    // UserProfile fields
    private String firstName;
    private String lastName;
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

    // Getters and setters for all fields

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<String> getSpokenLanguages() {
        return spokenLanguages;
    }

    public void setSpokenLanguages(List<String> spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    public List<EmploymentHistory> getEmploymentHistory() {
        return employmentHistory;
    }

    public void setEmploymentHistory(List<EmploymentHistory> employmentHistory) {
        this.employmentHistory = employmentHistory;
    }

    public List<String> getTechnicalSkills() {
        return technicalSkills;
    }

    public void setTechnicalSkills(List<String> technicalSkills) {
        this.technicalSkills = technicalSkills;
    }

    public List<String> getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(List<String> softSkills) {
        this.softSkills = softSkills;
    }

    public EducationBackground getEducationBackground() {
        return educationBackground;
    }

    public void setEducationBackground(EducationBackground educationBackground) {
        this.educationBackground = educationBackground;
    }

    public List<String> getDesiredJobTitles() {
        return desiredJobTitles;
    }

    public void setDesiredJobTitles(List<String> desiredJobTitles) {
        this.desiredJobTitles = desiredJobTitles;
    }

    public List<String> getPreferredWorkLocations() {
        return preferredWorkLocations;
    }

    public void setPreferredWorkLocations(List<String> preferredWorkLocations) {
        this.preferredWorkLocations = preferredWorkLocations;
    }

    public double getExpectedSalaryMin() {
        return expectedSalaryMin;
    }

    public void setExpectedSalaryMin(double expectedSalaryMin) {
        this.expectedSalaryMin = expectedSalaryMin;
    }

    public double getExpectedSalaryMax() {
        return expectedSalaryMax;
    }

    public void setExpectedSalaryMax(double expectedSalaryMax) {
        this.expectedSalaryMax = expectedSalaryMax;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }
}

