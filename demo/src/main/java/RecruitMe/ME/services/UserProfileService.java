package RecruitMe.ME.services;

import RecruitMe.ME.dto.CreateUserRequestDTO;
import RecruitMe.ME.dto.UpdateProfileRequestDTO;
import RecruitMe.ME.models.*;
import RecruitMe.ME.repositories.JobRepository;
import RecruitMe.ME.repositories.UserProfileRepository;
import RecruitMe.ME.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserProfileService {

    @Autowired
    private final  UserProfileRepository userProfileRepository;
    private final UserRepository userRepository;
    private final JobRepository jobRepository;

    public UserProfileService(UserProfileRepository userProfileRepository, UserRepository userRepository, JobRepository jobRepository) {
        this.userProfileRepository = userProfileRepository;
        this.userRepository = userRepository;
        this.jobRepository = jobRepository;
    }
    private final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12, new SecureRandom());

    public UserProfile getUserProfile(String profileId) {
        return userProfileRepository.findById(profileId).orElseThrow(() -> new RuntimeException("Cannot Find Profile with That Id"));

    }
public UserProfile updateProfile(String userId, UpdateProfileRequestDTO requestDTO) {
        try {
            String hashedPassword = bCryptPasswordEncoder.encode(requestDTO.getPassword());
            UserProfile userProfile = userProfileRepository.findById(userId).orElseThrow(() -> new RuntimeException("No User Found With That Id"));
            userProfile.setUsername(requestDTO.getUsername());
            userProfile.setEmailAddress(requestDTO.getEmail());
            userProfile.setPassword(requestDTO.getPassword());
            userProfile.setFirstName(requestDTO.getFirstName());
            userProfile.setLastName(requestDTO.getLastName());
            userProfile.setPhoneNumber(requestDTO.getPhoneNumber());
            userProfile.setAddress(requestDTO.getAddress());
            userProfile.setDateOfBirth(requestDTO.getDateOfBirth());
            userProfile.setGender(requestDTO.getGender());
            userProfile.setNationality(requestDTO.getNationality());
            userProfile.setSpokenLanguages(requestDTO.getSpokenLanguages());
            userProfile.setEmploymentHistory(requestDTO.getEmploymentHistory());
            userProfile.setTechnicalSkills(requestDTO.getTechnicalSkills());
            userProfile.setSoftSkills(requestDTO.getSoftSkills());
            userProfile.setEducationBackground(requestDTO.getEducationBackground());
            userProfile.setDesiredJobTitles(requestDTO.getDesiredJobTitles());
            userProfile.setPreferredWorkLocations(requestDTO.getPreferredWorkLocations());
            userProfile.setExpectedSalaryMin(requestDTO.getExpectedSalaryMin());
            userProfile.setExpectedSalaryMax(requestDTO.getExpectedSalaryMax());
            userProfile.setAddress(requestDTO.getAddress());
            userProfile.setSpokenLanguages(requestDTO.getSpokenLanguages());

            // update the user fields
            if(userProfile.getUserId() != null) {
                User user = userRepository.findById(userProfile.getUserId())
                        .orElseThrow(() -> new RuntimeException("No User Found With That Id"));
                user.setEmail(requestDTO.getEmail());
                user.setPassword(hashedPassword);
                user.setUsername(requestDTO.getUsername());
                userRepository.save(user);
            }


            return userProfileRepository.save(userProfile);
        } catch (Exception error) {
            System.out.print(error.toString());
            throw new RuntimeException(error.toString());
        }

    }


}
