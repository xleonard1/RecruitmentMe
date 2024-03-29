package RecruitMe.ME.controllers;

import RecruitMe.ME.models.User;
import RecruitMe.ME.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

   @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user.getUsername(), user.getPassword(), user.getEmail(), user.getRole());
    }
}
