package RecruitMe.ME.controllers;

import RecruitMe.ME.dto.UpdateClientProfileDTO;
import RecruitMe.ME.models.ClientProfile;
import RecruitMe.ME.services.ClientProfileService;
import org.springframework.expression.spel.CodeFlow;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientProfileController {
private final ClientProfileService clientProfileService;
public  ClientProfileController(ClientProfileService clientProfileService){
    this.clientProfileService = clientProfileService;
}

@PutMapping("/clientview/{profileId}")
public ResponseEntity<ClientProfile> updateClientProfile(@PathVariable String profileId, @RequestBody UpdateClientProfileDTO requestDTO) {
   ClientProfile clientProfile = clientProfileService.updateClientProfile(profileId, requestDTO);
   if(clientProfile!= null){
       return ResponseEntity.ok(clientProfile);
   } else {
       return ResponseEntity.notFound().build();
   }
}

}
