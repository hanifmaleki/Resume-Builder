package mlk.hanif.resumeBuilder.controller;

import mlk.hanif.resumeBuilder.ContextMaker;
import mlk.hanif.resumeBuilder.model.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LanguageController {

     @Autowired
     private ContextMaker contextMaker;

    @GetMapping(value = "/languages")
    public List<Language> getLanguages(){
        return contextMaker.getContext().getLanguages();
    }
}
