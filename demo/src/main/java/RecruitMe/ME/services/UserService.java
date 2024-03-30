package RecruitMe.ME.services;

import RecruitMe.ME.models.Role;
import RecruitMe.ME.models.User;
import RecruitMe.ME.models.UserProfile;
import RecruitMe.ME.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.security.SecureRandom;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    int strength = 10;

    private final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(strength, new SecureRandom());
    public UserService(UserRepository userRepository){
      this.userRepository = userRepository;
   }

     public User registerUser(String username, String email, String password, Role role) {
         String hashedPassword = bCryptPasswordEncoder.encode(password);
         User user = new User(username, email, hashedPassword, role);
         System.out.print(hashedPassword);
         return userRepository.save(user);
     };

    public User getUserByIdWithProfile(String userId) {
        User user = userRepository.findById(userId).orElseThrow(()-> new RuntimeException("User not found with ID: " + userId));
        if(user != null) {
            UserProfile userProfile = user.getProfileId();
        }
        return user;
    }


}
