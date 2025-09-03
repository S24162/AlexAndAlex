package pjatk.alexandalex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class GalleryController {

   @ModelAttribute
   public void addCommonAttributes(Model model) {
      model.addAttribute("page", "gallery");
   }

   @GetMapping("/gallery")
   public String getGaleria(Model model) {
      return "galeria";
   }
}
