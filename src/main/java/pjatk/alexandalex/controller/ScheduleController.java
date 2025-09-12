package pjatk.alexandalex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ScheduleController {

   @ModelAttribute
   public void addCommonAttributes(Model model) {
      model.addAttribute("page", "schedule");
   }

   @GetMapping("/schedule")
   public String getHarmonogram(Model model) {
      return "harmonogram";
   }

   @GetMapping("/search")
   public String searchOrder(@RequestParam String orderNumber, Model model) {
      // Zrobić zapytanie do Bitrix24 i wysłać odpowiedź
      if (!orderNumber.isEmpty())
         model.addAttribute("orderNumber", orderNumber + " answer from Bitrix");
      return "harmonogram";
   }
}
