package mlk.hanif.resumeBuilder.model;

import lombok.Data;

@Data
public class Language extends BaseResumeObject{
    private String title;
    private String level;
    private String certificate;
}
