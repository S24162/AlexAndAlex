package pjatk.alexandalex.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;
import pjatk.alexandalex.dto.KitchenMeasurementDTO;
import pjatk.alexandalex.service.KitchenMeasurementService;

import java.util.Map;


@RequiredArgsConstructor
@Controller
public class PriceController {

   private final KitchenMeasurementService kitchenMeasurementService;

   @GetMapping("/price")
   public String getPrice(Model model) {
      model.addAttribute("page", "price");
      return "ceny";
   }

   @PostMapping("/price")
   @ResponseBody
   public Map<String, Object> calculate(@RequestBody KitchenMeasurementDTO dto) {
      double price = kitchenMeasurementService.calculatePrice(dto);
//      System.out.println("price controller returns: " + price);
      return Map.of("price", price);
   }

}
