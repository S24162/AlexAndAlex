package pjatk.alexandalex.repository;

import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pjatk.alexandalex.model.KitchenMeasurement;

@Repository
public interface KitchenMeasurementRepo extends JpaRepository<KitchenMeasurement, Long> {

}
