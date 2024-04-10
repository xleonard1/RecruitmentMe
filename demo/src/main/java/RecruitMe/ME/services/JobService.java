package RecruitMe.ME.services;

import RecruitMe.ME.dto.CreateJobPostingDTO;
import RecruitMe.ME.models.ClientProfile;
import RecruitMe.ME.models.Job;
import RecruitMe.ME.repositories.ClientProfileRepository;
import RecruitMe.ME.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class JobService {

    @Autowired
    private final JobRepository jobRepository;
    private final ClientProfileRepository clientProfileRepository;

    public JobService(JobRepository jobRepository, ClientProfileRepository clientProfileRepository) {
        this.jobRepository = jobRepository;
        this.clientProfileRepository = clientProfileRepository;
    }

    public Job createJobPosting(CreateJobPostingDTO createJobPostingDTO) {
        try{
            Job job = new Job();
            job.setJobDescription(createJobPostingDTO.jobDescription());
            job.setJobTitle(createJobPostingDTO.getJobTitle());
            job.setCompanyName(createJobPostingDTO.getCompanyName());
            job.setLocation(createJobPostingDTO.getLocation());
            job.setTopThreeSkills(createJobPostingDTO.getTopThreeSkills());
            job.setNiceToHaves(createJobPostingDTO.getNiceToHaves());
            job.setSalaryRange(createJobPostingDTO.getSalaryRange());
            job.setEducationalRequirements(createJobPostingDTO.getEducationalRequirements());
            job.setJobPostedDate(new Date());
            job.setIndustry(createJobPostingDTO.getIndustry());
            job.setEmploymentType(createJobPostingDTO.getEmploymentType());
            job.setJobStatus(createJobPostingDTO.getJobStatus());

            ClientProfile clientProfile = clientProfileRepository.findById(createJobPostingDTO.getClientId()).orElseThrow(() -> new NoSuchElementException("cannot find client profile" + createJobPostingDTO.getClientId()));
            clientProfile.addJob(job);

            clientProfileRepository.save(clientProfile);


            return jobRepository.save(job);
        } catch (NoSuchElementException error) {
            // Handle the case where the client profile with the given ID is not found
            throw new IllegalArgumentException("Client profile not found with ID: " + createJobPostingDTO.getClientId());
        }
    }

    public List<Job> getAllJobs(){
        try{
           return jobRepository.findAll();
        } catch(Exception error){
            throw new RuntimeException(error);
        }
    }

}
