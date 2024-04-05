package RecruitMe.ME.services;

import RecruitMe.ME.dto.UpdateClientProfileDTO;
import RecruitMe.ME.models.ClientProfile;
import RecruitMe.ME.models.User;
import RecruitMe.ME.repositories.ClientProfileRepository;
import RecruitMe.ME.repositories.UserRepository;
import ch.qos.logback.core.net.server.Client;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.security.SecureRandom;

public class ClientProfileService {
    private final ClientProfileRepository clientProfileRepository;
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12, new SecureRandom());


    public ClientProfileService(UserRepository userRepository, ClientProfileRepository clientProfileRepository) {
        this.userRepository = userRepository;
        this.clientProfileRepository = clientProfileRepository;
    }

    public ClientProfile updateClientProfile(String clientProfileId, UpdateClientProfileDTO requestDto) {
        try {
            String hashedPassword = bCryptPasswordEncoder.encode(requestDTO.getPassword());
            ClientProfile clientProfile = clientProfileRepository.findById(clientProfileId).orElseThrow(() ->  new RuntimeException("No Client Found with that Id"));
            clientProfile.setClientPassword(requestDto.getPassword());
            clientProfile.setClientEmail(requestDto.getEmail());
            clientProfile.setClientUsername(requestDto.getUsername());
            clientProfile.setCompanyDescription(requestDto.getCompanyDescription());
            clientProfile.setCompanyStories(requestDto.getClientStories());
            clientProfile.setNumberOfEmployees(requestDto.getNumberOfEmployees());

            if(clientProfile.getUserId() != null) {
                User user = userRepository.findById((clientProfile.getUserId()))
                    user.setEmail(requestDTO.getEmail());
                    user.setPassword(hashedPassword);
                    user.setUsername(requestDTO.getUsername());
                    userRepository.save(user);
            }

            return clientProfileRepository.save(clientProfile);

        } catch (Error error){
            System.out.print(error.toString());
            throw new RuntimeException(error.toString());

        }
    }

}
