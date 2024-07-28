package RecruitMe.ME.services;

import RecruitMe.ME.controllers.UserController;
import RecruitMe.ME.dto.CreateJobPostingDTO;
import RecruitMe.ME.models.*;
import RecruitMe.ME.repositories.ClientProfileRepository;
import RecruitMe.ME.repositories.JobRepository;
import RecruitMe.ME.repositories.UserProfileRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class JobService {

    @Autowired
    private final JobRepository jobRepository;
    private final ClientProfileRepository clientProfileRepository;

    private final UserProfileRepository userProfileRepository;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    public JobService(JobRepository jobRepository, ClientProfileRepository clientProfileRepository, UserProfileRepository userProfileRepository) {
        this.jobRepository = jobRepository;
        this.clientProfileRepository = clientProfileRepository;
        this.userProfileRepository = userProfileRepository;
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

    public void applyForJob(String userId, String jobId) {
        UserProfile userProfile = userProfileRepository.findById(userId).orElseThrow(() -> new RuntimeException("cannot find user with that Id"));
        Job job = jobRepository.findById(jobId).orElseThrow(() -> new RuntimeException("cannot find job with that Id"));

        List<AppliedJob> appliedJobs = userProfile.getAppliedJobs();

        if(appliedJobs == null) {
            appliedJobs = new ArrayList<>();
        }

        appliedJobs.add(new AppliedJob(job.getJobId(), job.getJobTitle()));
        userProfile.setAppliedJobs(appliedJobs);

        List<JobApplicant> applicants = job.getApplicants();
        if(applicants == null){
            applicants = new ArrayList<>();
        }

        JobApplicant applicant = createJobApplicant(userProfile);

        applicants.add(applicant);
        job.setApplicants(applicants);


        userProfileRepository.save(userProfile);
        jobRepository.save(job);
    }
    private JobApplicant createJobApplicant(UserProfile userProfile) {
        JobApplicant applicant = new JobApplicant();
        applicant.setFirstName(userProfile.getFirstName());
        applicant.setLastName(userProfile.getLastName());
        applicant.setDateOfBirth(userProfile.getDateOfBirth());
        applicant.setEmailAddress(userProfile.getEmailAddress());
        applicant.setGender(userProfile.getGender());
        applicant.setPhoneNumber(userProfile.getPhoneNumber());
        applicant.setSoftSkills(userProfile.getSoftSkills());
        applicant.setSpokenLanguages(userProfile.getSpokenLanguages());
        applicant.setTechnicalSkills(userProfile.getTechnicalSkills());
        applicant.setApplicantId(userProfile.getId());
        applicant.setEducationBackground(userProfile.getEducationBackground());
        return applicant;
    }

}
