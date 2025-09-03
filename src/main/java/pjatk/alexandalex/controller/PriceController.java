package pjatk.alexandalex.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import pjatk.alexandalex.dto.KitchenMeasurementDTO;
import pjatk.alexandalex.service.KitchenMeasurementService;

import java.math.BigDecimal;
import java.util.Map;


@RequiredArgsConstructor
@Controller
public class PriceController {

   private final KitchenMeasurementService kitchenMeasurementService;

   @ModelAttribute
   public void addCommonAttributes(Model model) {
      model.addAttribute("page", "price");
   }

   @GetMapping("/price")
   public String getPrice(Model model) {
      return "ceny";
   }

   @PostMapping("/price")
   @ResponseBody
   public Map<String, Object> calculate(@RequestBody KitchenMeasurementDTO dto) {
      BigDecimal price = kitchenMeasurementService.calculatePrice(dto);
      System.out.println(dto.getColorId());
      System.out.println(dto.getMaterialId());
      System.out.println(dto.getMechanismId());
      System.out.println(price);


//      System.out.println("price controller returns: " + price);
      return Map.of("price", price);
   }

}
