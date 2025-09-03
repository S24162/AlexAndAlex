package pjatk.alexandalex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pjatk.alexandalex.model.Material;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Long> {
}
