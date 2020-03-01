package mlk.hanif.resumeBuilder.controller;

import mlk.hanif.resumeBuilder.ContextMaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private ContextMaker contextMaker;

    @GetMapping("/")
    public String getHomePage(Model model){
        String[] names = {"John", "Sebastian", "Mark", "Gerhard"};
        contextMaker.getContext().getEducations();
        model.addAttribute("names", names);
        return "home";
    }
}
