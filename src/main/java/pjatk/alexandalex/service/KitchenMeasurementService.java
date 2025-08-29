package pjatk.alexandalex.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pjatk.alexandalex.dto.KitchenMeasurementDTO;


@Service
public class KitchenMeasurementService {

   public double calculatePrice(KitchenMeasurementDTO dto) {
      System.out.println();
      return dto.getC3()*2;
   }
}
