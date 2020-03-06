package mlk.hanif.resumeBuilder.rest.controller;

import mlk.hanif.resumeBuilder.ContextMaker;
import mlk.hanif.resumeBuilder.model.Language;

import mlk.hanif.resumeBuilder.restApi.api.LangsApi;
import mlk.hanif.resumeBuilder.restApi.model.LanguageResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LanguageRestController implements LangsApi {

     @Autowired
     private ContextMaker contextMaker;

    @GetMapping(value = "/languages")
    public List<Language> getLanguages(){
        return contextMaker.getContext().getLanguages();
    }

    @Override
    public ResponseEntity<List<LanguageResource>> langsGet() {

        //TODO please use DZONE for the convertion

        return ResponseEntity.ok(null);
    }
}
