package RecruitMe.ME.repositories;

import RecruitMe.ME.models.Job;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobRepository extends MongoRepository<Job, String> {

}
