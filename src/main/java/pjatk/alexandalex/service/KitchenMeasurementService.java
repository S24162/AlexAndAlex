package pjatk.alexandalex.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pjatk.alexandalex.dto.KitchenMeasurementDTO;
import pjatk.alexandalex.model.Color;
import pjatk.alexandalex.model.Material;
import pjatk.alexandalex.model.Mechanism;
import pjatk.alexandalex.repository.ColorRepository;
import pjatk.alexandalex.repository.MaterialRepository;
import pjatk.alexandalex.repository.MechanismRepository;

import java.math.BigDecimal;


@Service
@RequiredArgsConstructor
public class KitchenMeasurementService {

   private final MaterialRepository materialRepository;
   private final ColorRepository colorRepository;
   private final MechanismRepository mechanismRepository;

   public BigDecimal calculatePrice(KitchenMeasurementDTO dto) {

      Material material = materialRepository.findByCode(dto.getMaterialId())
         .orElseThrow(() -> new RuntimeException("Material not found: " + dto.getMaterialId()));

      Color color = colorRepository.findByCode(dto.getColorId())
         .orElseThrow(() -> new RuntimeException("Color not found: " + dto.getColorId()));

      Mechanism mechanism = mechanismRepository.findByCode(dto.getMechanismId())
         .orElseThrow(() -> new RuntimeException("Mechanism not found: " + dto.getMechanismId()));

      // Obliczenie powierzchni (sekcja 3: głębokości)
      BigDecimal totalArea = BigDecimal.valueOf(
         dto.getA3() + dto.getB3() + dto.getC3());

      // Cena materiału
      BigDecimal price = totalArea.multiply(material.getPricePerM2());

      // Dodanie kosztu koloru
      price = price.add(color.getExtraCost());

      // Dodanie ceny mechanizmów (przykład: 3 sztuki)
      price = price.add(mechanism.getPricePerUnit().multiply(BigDecimal.valueOf(1)));

      // Zwracamy double, jeśli API oczekuje liczby
      return price;
   }
}
