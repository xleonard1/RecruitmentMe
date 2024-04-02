package RecruitMe.ME.controllers;

import RecruitMe.ME.dto.UpdateProfileRequestDTO;
import RecruitMe.ME.models.UserProfile;
import RecruitMe.ME.services.UserProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class ProfileController {
    private final UserProfileService userProfileService;

    public ProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

  @GetMapping("users/profile/{profileId}")
  public ResponseEntity<UserProfile> getUserProfileById(@PathVariable  String profileId) {
       UserProfile userProfile = userProfileService.getUserProfile(profileId);
       if(userProfile != null) {
           return ResponseEntity.ok(userProfile);
       } else {
           return ResponseEntity.notFound().build();
       }
  }

    @PutMapping("/users/{userId}")
    public ResponseEntity<UserProfile> updateUserProfile(@PathVariable String userId, @RequestBody UpdateProfileRequestDTO requestDTO) {
        UserProfile userProfile = userProfileService.updateProfile(userId, requestDTO);
        if(userProfile != null) {
            return ResponseEntity.ok(userProfile);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
