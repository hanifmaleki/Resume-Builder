package mlk.hanif.resumeBuilder.model;

import lombok.Data;

import java.util.List;

@Data
public class Resume {
    PersonalInfo personalInfo;
    List<Education> educations;
    List<Experience> experiences;
    List<Language> languages;
    List<AcademicProject> academicProjects;
    List<Certificate> certificates;
    List<Skill> skills;
    List<Interest> interests;
}
