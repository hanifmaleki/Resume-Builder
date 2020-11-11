package mlk.hanif.resumeBuilder.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Company extends BaseResumeObject{
    private String title;
    private String website;
    private String city;
    private String description;
    private String icon;
}
