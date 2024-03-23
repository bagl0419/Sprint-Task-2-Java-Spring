package bitlab.sprinttask2javaspring.repository;

import bitlab.sprinttask2javaspring.model.ApplicationRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRequestRepository extends JpaRepository<ApplicationRequest, Long> {

}
