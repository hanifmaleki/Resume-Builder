package mlk.hanif.resumeBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import mlk.hanif.resumeBuilder.model.*;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

public class ContextMaker {

    public Resume getContext() {

        Resume resume = new Resume();
        resume.setPersonalInfo(readDataFromJsonFile("personalInfo.json", PersonalInfo.class));
        resume.setEducations(Arrays.asList(readDataFromJsonFile("educations.json", Education[].class)));
        resume.setExperiences(Arrays.asList(readDataFromJsonFile("experiences.json", Experience[].class)));
        resume.setLanguages(Arrays.asList(readDataFromJsonFile("languages.json", Language[].class)));
        resume.setAcademicProjects(Arrays.asList(readDataFromJsonFile("academicProjects.json", AcademicProject[].class)));

        return resume;
    }

    private <T> T readDataFromJsonFile(String fileName, Class<T> clazz) {
        ObjectMapper mapper = new ObjectMapper();
        URL resource = Application.class.getClassLoader().getResource(fileName);
        try {
            return mapper.readValue(resource, clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
