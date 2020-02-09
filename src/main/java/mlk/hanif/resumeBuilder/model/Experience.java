package mlk.hanif.resumeBuilder.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Experience {
    Company company;
    Date dateFrom;
    Date dateTo;
    String leavingReason;
    String jobTitle;
    List<Projects> projects ;
}
