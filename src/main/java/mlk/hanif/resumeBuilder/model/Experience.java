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
public class Experience extends BaseResumeObject{
    private Company company;
    private Date dateFrom;
    private Date dateTo;
    private String leavingReason;
    private String jobTitle;
    private String city;
    private List<Projects> projects ;
    private List<Technology> technologies;
    private List<Achievement> achievements;
    private boolean show=true;
}
