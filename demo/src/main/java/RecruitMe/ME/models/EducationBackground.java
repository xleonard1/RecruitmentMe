package RecruitMe.ME.models;

public class EducationBackground {
    private String degree;
    private String institution;
    private int graduationYear;

    public EducationBackground(String degree, String institution, int graduationYear) {
        this.degree = degree;
        this.institution = institution;
        this.graduationYear = graduationYear;
    }

    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }
    public int getGraduationYear() {
        return graduationYear;
    }
    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }
    public String getInstitution() {
        return institution;
    }
    public void setInstitution(java.lang.String institution) {
        this.institution = institution;
    }
}
