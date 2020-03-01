package mlk.hanif.resumeBuilder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String getHomePage(Model model){
        String[] names = {"John", "Sebastian", "Mark", "Gerhard"};
        model.addAttribute("names", names);
        return "home";
    }
}
