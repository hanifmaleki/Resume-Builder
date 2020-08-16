package mlk.hanif.resumeBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import mlk.hanif.resumeBuilder.model.*;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

@Component
public class ContextMaker {


    private Resume resume = null;

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
        resume.setInterests(Arrays.asList(readDataFromJsonFile("jsons/interests.json", Interest[].class)));

        return resume;
    }

    private <T> T readDataFromJsonFile(String fileName, Class<T> clazz) {
        ObjectMapper mapper = new ObjectMapper();
        URL resource = this.getClass().getClassLoader().getResource(fileName);
        try {
            return mapper.readValue(resource, clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
