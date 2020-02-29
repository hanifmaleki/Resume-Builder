package mlk.hanif.resumeBuilder.rest.controller;

import mlk.hanif.resumeBuilder.ContextMaker;
import mlk.hanif.resumeBuilder.model.Language;
import mlk.hanif.resumeBuilder.model.PersonalInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonalInfoRestController {

     @Autowired
     private ContextMaker contextMaker;

    @GetMapping(value = "/personal")
    public PersonalInfo getPersonalInfo(){
        return contextMaker.getContext().getPersonalInfo();
    }
}
