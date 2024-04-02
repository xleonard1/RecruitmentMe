package RecruitMe.ME.repositories;

import RecruitMe.ME.models.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserProfileRepository extends MongoRepository<UserProfile, String> {

}
