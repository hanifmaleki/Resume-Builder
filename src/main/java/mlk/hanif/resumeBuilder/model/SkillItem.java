package mlk.hanif.resumeBuilder.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class SkillItem extends BaseResumeObject{
    private String title;

    private Familiarity familiarity;

    private String experienceDuration; //TODO Familiarity as enum => it needs renderer
    private Date last;
}
