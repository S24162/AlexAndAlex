package pjatk.alexandalex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pjatk.alexandalex.model.Mechanism;

import java.util.Optional;

@Repository
public interface MechanismRepository extends JpaRepository<Mechanism, Long> {
   Optional<Mechanism> findByCode(String code);
}
