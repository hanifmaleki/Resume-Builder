package mlk.hanif.resumeBuilder.controller;

import mlk.hanif.resumeBuilder.ContextMaker;
import mlk.hanif.resumeBuilder.model.Certificate;
import mlk.hanif.resumeBuilder.model.Education;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CertificateController {

    @Autowired
    private ContextMaker contextMaker;

    @GetMapping("/certificate")
    public String getEntities(Model model){
        List<Certificate> names = contextMaker.getContext().getCertificates();
        model.addAttribute("certificates", names);
        return "certificate";
    }
}
