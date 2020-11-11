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
public class Skill extends BaseResumeObject{
    private String group;
    private String title;
    private List<SkillItem> skillItems;
    private String icon;

}
