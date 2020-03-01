package mlk.hanif.resumeBuilder.controller;

import mlk.hanif.resumeBuilder.ContextMaker;
import mlk.hanif.resumeBuilder.model.Education;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EducationController {

    @Autowired
    private ContextMaker contextMaker;

    @GetMapping("/education")
    public String getHomePage(Model model){
//        String[] names = {"John", "Sebastian", "Mark", "Gerhard"};
        List<Education> names = contextMaker.getContext().getEducations();
        model.addAttribute("names", names);
        return "education";
    }
}
