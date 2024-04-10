package RecruitMe.ME.controllers;

import RecruitMe.ME.dto.CreateJobPostingDTO;
import RecruitMe.ME.models.Job;
import RecruitMe.ME.services.JobService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {
    private final JobService jobService;
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping("/job")
    public Job createJob(@RequestBody CreateJobPostingDTO createJobPostingDTO){
        return jobService.createJobPosting(createJobPostingDTO);
    }

    @GetMapping("/jobs")
    public ResponseEntity<List<Job>> getAllJobs() {
       List<Job> jobs = jobService.getAllJobs();
       if(jobs != null) {
           return ResponseEntity.ok(jobs);
       } else {
           return ResponseEntity.notFound().build();
       }
    }
}
