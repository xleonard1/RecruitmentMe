package RecruitMe.ME.repositories;

import RecruitMe.ME.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {


}

