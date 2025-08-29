package pjatk.alexandalex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TermsController {

   @GetMapping("/terms")
   public String getWarunki(Model model) {
      model.addAttribute("page", "terms");
      return "warunki";
   }
}
