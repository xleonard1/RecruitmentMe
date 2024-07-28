package RecruitMe.ME.controllers;

import RecruitMe.ME.dto.CreateUserRequestDTO;
import RecruitMe.ME.models.User;
import RecruitMe.ME.services.JobService;
import RecruitMe.ME.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserService userService;
    @Autowired
    private final JobService jobService;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    public UserController(
            UserService userService,
            JobService jobService
    ) {
        this.userService = userService;
        this.jobService = jobService;
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
    @PostMapping("/{userId}/apply/{jobId}")
    public ResponseEntity<String> applyForJob(@PathVariable String userId, @PathVariable String jobId) {
        logger.debug("Received applyForJob request with userId: {} and jobId: {}", userId, jobId);
        try {
            jobService.applyForJob(userId, jobId);
            return ResponseEntity.ok("Job application successful");
        } catch (RuntimeException e) {
            logger.error("Error applying for job", e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

}
