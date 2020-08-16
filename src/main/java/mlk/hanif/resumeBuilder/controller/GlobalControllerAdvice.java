package mlk.hanif.resumeBuilder.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
public class GlobalControllerAdvice {
    //TODO study and add @InitBinder
    //TODO study and add @ExceptionHandler
    //TODO https://www.concretepage.com/spring/spring-mvc/spring-mvc-controlleradvice-annotation-example

    Map<String, String> pages = new HashMap<String, String>(){
        {
            put("home", "/");
            put("education", "education");
            put("skill", "skill");
            put("experience", "experience");
            put("language", "language");
            put("academicProject", "academicProject");
            put("certificate", "certificate");
            put("interest", "interest");
        }
    };

    @ModelAttribute
    public void handleRequest(HttpServletRequest request, Model model){
        model.addAttribute("pages", pages);
    }

}
