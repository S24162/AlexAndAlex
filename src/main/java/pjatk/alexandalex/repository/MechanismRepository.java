package pjatk.alexandalex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pjatk.alexandalex.model.Mechanism;

@Repository
public interface MechanismRepository extends JpaRepository<Mechanism, Long> {
}
