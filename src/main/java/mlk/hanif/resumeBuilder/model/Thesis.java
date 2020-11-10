package mlk.hanif.resumeBuilder.model;

import lombok.Data;

@Data
public class Thesis extends BaseResumeObject{
    private String title;
    private String supervisor;
    private String institute;
    private String description;

}
