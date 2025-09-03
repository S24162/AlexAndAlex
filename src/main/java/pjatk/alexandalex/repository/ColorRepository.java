package pjatk.alexandalex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pjatk.alexandalex.model.Color;

@Repository
public interface ColorRepository extends JpaRepository<Color, Long> {
}
