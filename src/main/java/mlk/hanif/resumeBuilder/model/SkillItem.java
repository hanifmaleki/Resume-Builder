package mlk.hanif.resumeBuilder.model;

import lombok.Data;

import java.util.Date;

@Data
public class SkillItem {
    private String title;
    private String familiarity; //TODO Familiarity as enum => it needs renderer
    private String experienceDuration; //TODO Familiarity as enum => it needs renderer
    private Date last;
}
