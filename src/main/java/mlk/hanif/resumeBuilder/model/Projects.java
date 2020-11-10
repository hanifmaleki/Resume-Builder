package mlk.hanif.resumeBuilder.model;

import lombok.Data;

@Data
public class Projects extends BaseResumeObject{
    private String title;
    private String description;
    private String website;
}
