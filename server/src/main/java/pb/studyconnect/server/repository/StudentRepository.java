package pb.studyconnect.server.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pb.studyconnect.server.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}