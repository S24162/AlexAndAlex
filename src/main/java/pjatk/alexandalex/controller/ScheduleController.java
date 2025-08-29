package pjatk.alexandalex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScheduleController {

   @GetMapping("/schedule")
   public String getHarmonogram(Model model) {
      model.addAttribute("page", "schedule");
      return "harmonogram";
   }
}
