package mlk.hanif.resumeBuilder.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Language extends BaseResumeObject{
    private String title;
    private String level;
    private String certificate;
}
