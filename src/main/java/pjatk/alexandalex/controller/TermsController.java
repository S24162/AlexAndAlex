package pjatk.alexandalex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class TermsController {

   @ModelAttribute
   public void addCommonAttributes(Model model) {
      model.addAttribute("page", "terms");
   }

   @GetMapping("/terms")
   public String getWarunki(Model model) {
      return "warunki";
   }
}
