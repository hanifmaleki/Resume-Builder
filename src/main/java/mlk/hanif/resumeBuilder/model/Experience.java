package mlk.hanif.resumeBuilder.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Experience {
    private Company company;
    private Date dateFrom;
    private Date dateTo;
    private String leavingReason;
    private String jobTitle;
    private String city;
    private List<Projects> projects ;
    private List<Technology> technologies;
    private List<Achievement> achievements;
}
