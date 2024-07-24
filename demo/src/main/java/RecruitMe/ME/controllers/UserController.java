package RecruitMe.ME.controllers;

import RecruitMe.ME.dto.CreateUserRequestDTO;
import RecruitMe.ME.models.User;
import RecruitMe.ME.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

   @PostMapping("/users")
    public User createUser(@RequestBody CreateUserRequestDTO requestDTO) {
        return userService.registerUser(requestDTO);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<User> getUserByIdWithProfile(@PathVariable String userId) {
        User user = userService.getUserByIdWithProfile(userId);
        if(user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
