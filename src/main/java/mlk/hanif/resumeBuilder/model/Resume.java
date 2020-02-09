package mlk.hanif.resumeBuilder.model;

import lombok.Data;

import java.util.List;

@Data
public class Resume {
    PersonalInfo personalInfo;
    List<Education> educations;
    List<Experience> experiences;
    List<Language> languages;

}
