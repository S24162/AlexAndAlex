package pjatk.alexandalex.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pjatk.alexandalex.dto.KitchenMeasurementDTO;
import pjatk.alexandalex.repository.ColorRepository;
import pjatk.alexandalex.repository.MaterialRepository;
import pjatk.alexandalex.repository.MechanismRepository;


@Service
@RequiredArgsConstructor
public class KitchenMeasurementService {

   private final MaterialRepository materialRepository;
   private final ColorRepository colorRepository;
   private final MechanismRepository mechanismRepository;

   public double calculatePrice(KitchenMeasurementDTO dto) {
      System.out.println();
      return dto.getC3()*2;
   }
}
