package mlk.hanif.resumeBuilder.controller;

import mlk.hanif.resumeBuilder.ContextMaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LanguageController {

    @Autowired
    private ContextMaker contextMaker;

    @GetMapping("/language")
    public String getAll(Model model){
        model.addAttribute("languages", contextMaker.getContext().getLanguages());
        return "lang";
    }

}
