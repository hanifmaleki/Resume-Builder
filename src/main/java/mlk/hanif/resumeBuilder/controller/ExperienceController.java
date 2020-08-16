package mlk.hanif.resumeBuilder.controller;

import mlk.hanif.resumeBuilder.ContextMaker;
import mlk.hanif.resumeBuilder.model.Certificate;
import mlk.hanif.resumeBuilder.model.Experience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ExperienceController {

    @Autowired
    private ContextMaker contextMaker;

    @GetMapping("/experience")
    public String getHomePage(Model model){
        List<Experience> names = contextMaker.getContext().getExperiences();
        model.addAttribute("experiences", names);
        return "experience";
    }
}
