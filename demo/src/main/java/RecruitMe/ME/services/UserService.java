package RecruitMe.ME.services;

import RecruitMe.ME.models.User;
import RecruitMe.ME.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
   private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
      this.userRepository = userRepository;
   }

   public User createUser(String username, String email, String password, String role) {
       User user = new User(username, email, password, role);
       return userRepository.save(user);
   }

}
