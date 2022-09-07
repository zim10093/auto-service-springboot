package core.autoserviceapp.repository;

import core.autoserviceapp.model.Workman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WokmanRepository extends JpaRepository<Workman, Long> {
}
