package mlk.hanif.resumeBuilder.controller;

import mlk.hanif.resumeBuilder.ContextMaker;
import mlk.hanif.resumeBuilder.model.PersonalInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrsonalInfoController {

    @Autowired
    private ContextMaker contextMaker;

    @GetMapping("/home")
    public String getPersonalInfo(Model model){
        PersonalInfo personalInfo = contextMaker.getContext().getPersonalInfo();
        model.addAttribute("personalInfo", personalInfo);
        return "home";
    }

}
