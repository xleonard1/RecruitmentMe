package RecruitMe.ME.services;

import RecruitMe.ME.dto.UpdateClientProfileDTO;
import RecruitMe.ME.models.ClientProfile;
import RecruitMe.ME.models.User;
import RecruitMe.ME.repositories.ClientProfileRepository;
import RecruitMe.ME.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;

@Service
public class ClientProfileService {

    @Autowired
    private final ClientProfileRepository clientProfileRepository;
    private final UserRepository userRepository;


    public ClientProfileService(UserRepository userRepository, ClientProfileRepository clientProfileRepository) {
        this.clientProfileRepository = clientProfileRepository;
        this.userRepository = userRepository;
    }

    private final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12, new SecureRandom());

    public ClientProfile updateClientProfile(String clientProfileId, UpdateClientProfileDTO requestDto) {
        try {
            String hashedPassword = bCryptPasswordEncoder.encode(requestDto.getClientPassword());
            ClientProfile clientProfile = clientProfileRepository.findById(clientProfileId).orElseThrow(() -> new RuntimeException("No Client Found with that Id"));
            clientProfile.setClientPassword(requestDto.getClientPassword());
            clientProfile.setClientEmail(requestDto.getClientEmail());
            clientProfile.setClientUsername(requestDto.getClientUsername());
            clientProfile.setCompanyDescription(requestDto.getCompanyDescription());
            clientProfile.setCompanyStories(requestDto.getCompanyStories());
            clientProfile.setNumberOfEmployees(requestDto.getNumberOfEmployees());
            clientProfile.setJobs(requestDto.getJobs());


            if (clientProfile.getUserId() != null) {
                User user = userRepository.findById((clientProfile.getUserId()))
                        .orElseThrow(() -> new RuntimeException("No User Found With That ID"));
                user.setEmail(requestDto.getClientEmail());
                user.setPassword(hashedPassword);
                user.setUsername(requestDto.getClientUsername());
                userRepository.save(user);
            }

            return clientProfileRepository.save(clientProfile);

        } catch (Error error) {
            System.out.print(error.getMessage());
            throw new RuntimeException(error.toString());

        }

    }

}
