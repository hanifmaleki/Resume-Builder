package mlk.hanif.resumeBuilder.model;

import lombok.Data;

import java.util.List;

@Data
public class Skill {
    private String group;
    private String title;
    private List<SkillItem> skillItems;

}
