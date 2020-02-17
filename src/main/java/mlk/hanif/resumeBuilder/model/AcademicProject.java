package mlk.hanif.resumeBuilder.model;

import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
public class AcademicProject {
    private String course;
    private String title;
    private Date date;
    private String description;
    private List<Technology> technologies;
}
