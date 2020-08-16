package mlk.hanif.resumeBuilder.controller;

import mlk.hanif.resumeBuilder.ContextMaker;
import mlk.hanif.resumeBuilder.model.AcademicProject;
import mlk.hanif.resumeBuilder.model.Certificate;
import mlk.hanif.resumeBuilder.model.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private ContextMaker contextMaker;

    @GetMapping("/")
    public String getEntities(Model model){
        Resume resume = contextMaker.getContext();
        model.addAttribute("resume", resume);
        return "index";
    }
}
