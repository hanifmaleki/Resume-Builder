package mlk.hanif.resumeBuilder.model;

import lombok.Data;

import java.util.List;

@Data
public class Projects {
    private String title;
    private String description;
    private String website;
    private List<Technology> technologies;
}
