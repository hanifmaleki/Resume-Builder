package mlk.hanif.resumeBuilder.model;

import lombok.Data;

@Data
public class Company extends BaseResumeObject{
    private String title;
    private String website;
    private String city;
    private String description;
    private String icon;
}
