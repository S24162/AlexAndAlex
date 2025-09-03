package pjatk.alexandalex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pjatk.alexandalex.model.Color;
import pjatk.alexandalex.model.Material;

import java.util.Optional;

@Repository
public interface ColorRepository extends JpaRepository<Color, Long> {
   Optional<Color> findByCode(String code);
}
