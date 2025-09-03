package pjatk.alexandalex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pjatk.alexandalex.model.Material;
import pjatk.alexandalex.model.Mechanism;

import java.util.Optional;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Long> {
   Optional<Material> findByCode(String code);
}
