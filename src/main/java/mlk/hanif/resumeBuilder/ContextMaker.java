package mlk.hanif.resumeBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import mlk.hanif.resumeBuilder.model.Experience;
import mlk.hanif.resumeBuilder.model.PersonalInfo;
import mlk.hanif.resumeBuilder.model.Resume;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

public class ContextMaker {

    public Resume getContext(){

        Resume resume = new Resume();
        Experience[] experiences = readDataFromJsonFile("experiences.json", Experience[].class);
        resume.setExperiences(Arrays.asList(experiences));
        resume.setPersonalInfo(readDataFromJsonFile("personalInfo.json", PersonalInfo.class));

        return resume ;
    }

    private <T> T readDataFromJsonFile(String fileName, Class<T> clazz){
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
