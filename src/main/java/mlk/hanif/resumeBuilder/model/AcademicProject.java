package mlk.hanif.resumeBuilder.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class AcademicProject extends BaseResumeObject{
    private String course;
    private String title;
    private Date date;
    private String description;
    private List<Technology> technologies;
}
