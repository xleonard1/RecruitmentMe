package RecruitMe.ME.models;

public class AppliedJob {
    private String jobId;
    private String jobName;

    public AppliedJob() {

    }

    public AppliedJob(String jobId, String jobName) {
        this.jobId = jobId;
        this.jobName = jobName;
    }

    public String getJobId() {
        return jobId;
    }
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}
