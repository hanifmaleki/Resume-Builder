package mlk.hanif.resumeBuilder.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Certificate extends BaseResumeObject{
    private String title;
    private String description;
    private String issuer;
    private String webAddress;
}
