package mlk.hanif.resumeBuilder.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
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
