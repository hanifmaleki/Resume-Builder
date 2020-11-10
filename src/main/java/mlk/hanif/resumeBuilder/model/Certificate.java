package mlk.hanif.resumeBuilder.model;

import lombok.Data;

@Data
public class Certificate extends BaseResumeObject{
    private String title;
    private String description;
    private String issuer;
    private String webAddress;
}
