package pjatk.alexandalex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class IndexController {

   @ModelAttribute
   public void addCommonAttributes(Model model) {
      model.addAttribute("page", "home");
   }

   @GetMapping("/")
   public String getIndex(Model model) {
      return "index";
   }
}
