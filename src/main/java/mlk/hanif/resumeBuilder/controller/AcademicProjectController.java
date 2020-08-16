package mlk.hanif.resumeBuilder.controller;

import mlk.hanif.resumeBuilder.ContextMaker;
import mlk.hanif.resumeBuilder.model.AcademicProject;
import mlk.hanif.resumeBuilder.model.Certificate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AcademicProjectController {

    @Autowired
    private ContextMaker contextMaker;

    @GetMapping("/academicProject")
    public String getEntities(Model model){
        List<AcademicProject> names = contextMaker.getContext().getAcademicProjects();
        model.addAttribute("academicProjects", names);
        return "academicProject";
    }
}
