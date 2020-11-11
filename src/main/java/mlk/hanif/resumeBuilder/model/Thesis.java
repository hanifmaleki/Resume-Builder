package mlk.hanif.resumeBuilder.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Thesis extends BaseResumeObject{
    private String title;
    private String supervisor;
    private String institute;
    private String description;

}
