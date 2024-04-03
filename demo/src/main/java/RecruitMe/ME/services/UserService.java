package RecruitMe.ME.services;

import RecruitMe.ME.dto.CreateUserRequestDTO;
import RecruitMe.ME.models.Role;
import RecruitMe.ME.models.User;
import RecruitMe.ME.models.UserProfile;
import RecruitMe.ME.repositories.UserProfileRepository;
import RecruitMe.ME.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.security.SecureRandom;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    int strength = 10;

    private final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(strength, new SecureRandom());
    private final UserProfileRepository userProfileRepository;
    public UserService(UserRepository userRepository, UserProfileRepository userProfileRepository) {
        this.userRepository = userRepository;
        this.userProfileRepository = userProfileRepository;
    }

     public User registerUser(CreateUserRequestDTO requestDTO) {
         try {
             String hashedPassword = bCryptPasswordEncoder.encode(requestDTO.getPassword());
             User user = new User(requestDTO.getUsername(), requestDTO.getEmail(), hashedPassword, requestDTO.getRole());
             User savedUser = userRepository.save(user);

             String userId = savedUser.getId();
             // Create and save UserProfile
             UserProfile userProfile = new UserProfile();
             userProfile.setEmailAddress(requestDTO.getEmail());
             userProfile.setPassword(hashedPassword);
             userProfile.setUserId(userId);

             UserProfile savedProfile = userProfileRepository.save(userProfile);

             // Set UserProfile in User
             user.setProfile(savedProfile);

             return savedUser;
         } catch (Exception error) {
             // Log the exception for debugging
             System.out.print(error.toString());
             throw new RuntimeException(error.toString());
         }
     };

    public User getUserByIdWithProfile(String userId) {
        User user = userRepository.findById(userId).orElseThrow(()-> new RuntimeException("User not found with ID: " + userId));
        if(user != null) {
            UserProfile userProfile = user.getProfile();
        }
        return user;
    }

    public User updateUser(String username, String email, String password, Role role) {
        User user = new User(username, email, password, role);
        return userRepository.save(user);
    }


}
