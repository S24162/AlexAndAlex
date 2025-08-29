package pjatk.alexandalex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GalleryController {

   @GetMapping("/gallery")
   public String getGaleria(Model model) {
      model.addAttribute("page", "gallery");
      return "galeria";
   }
}
