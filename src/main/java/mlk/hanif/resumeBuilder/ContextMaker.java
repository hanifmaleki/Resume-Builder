package mlk.hanif.resumeBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import mlk.hanif.resumeBuilder.model.*;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Collection;

@Component
public class ContextMaker {


    private Resume resume = null;

    private static Long id = 1L;

    public Resume getContext() {
        if (resume == null) {
            resume = fetchResume();
        }
        return resume;
    }

    private Resume fetchResume() {
        Resume resume = new Resume();
        resume.setPersonalInfo(readDataFromJsonFile("jsons/personalInfo.json", PersonalInfo.class));
        resume.setEducations(Arrays.asList(readDataFromJsonFile("jsons/educations.json", Education[].class)));
        resume.setExperiences(Arrays.asList(readDataFromJsonFile("jsons/experiences.json", Experience[].class)));
        resume.setLanguages(Arrays.asList(readDataFromJsonFile("jsons/languages.json", Language[].class)));
        resume.setAcademicProjects(Arrays.asList(readDataFromJsonFile("jsons/academicProjects.json", AcademicProject[].class)));
        resume.setCertificates(Arrays.asList(readDataFromJsonFile("jsons/certificates.json", Certificate[].class)));
        resume.setSkills(Arrays.asList(readDataFromJsonFile("jsons/skills.json", Skill[].class)));
        //TODO Hacky code
        resume.getSkills().stream()
            .map(skill-> skill.getSkillItems())
            .flatMap(Collection::stream)
            .forEach(item->item.setId(id++));

        resume.setInterests(Arrays.asList(readDataFromJsonFile("jsons/interests.json", Interest[].class)));

        return resume;
    }


    private <T> T readDataFromJsonFile(String fileName, Class<T> clazz) {
        ObjectMapper mapper = new ObjectMapper();
        URL resource = this.getClass().getClassLoader().getResource(fileName);
        try {
            T t = mapper.readValue(resource, clazz);
            if(clazz.isArray()){
                int length = Array.getLength(t);
                for (int i = 0; i < length; i ++) {
                    BaseResumeObject element = (BaseResumeObject) Array.get(t, i);
                    element.setId(id++);
                }
            } else {
                ((BaseResumeObject)t).setId(id++);
            }
            return t;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
