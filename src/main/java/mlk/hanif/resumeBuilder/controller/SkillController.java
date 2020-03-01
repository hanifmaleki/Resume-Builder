package mlk.hanif.resumeBuilder.controller;

import mlk.hanif.resumeBuilder.ContextMaker;
import mlk.hanif.resumeBuilder.model.Education;
import mlk.hanif.resumeBuilder.model.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SkillController {

    @Autowired
    private ContextMaker contextMaker;

    @GetMapping("/skill")
    public String getHomePage(Model model){
        List<Skill> skills = contextMaker.getContext().getSkills();
        model.addAttribute("skills", skills);
        return "skill";
    }
}
