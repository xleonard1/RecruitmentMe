package RecruitMe.ME.repositories;

import RecruitMe.ME.models.ClientProfile;
import ch.qos.logback.core.net.server.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientProfileRepository extends MongoRepository<ClientProfile, String> {
}
