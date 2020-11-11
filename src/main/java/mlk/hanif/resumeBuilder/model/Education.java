package mlk.hanif.resumeBuilder.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Education extends BaseResumeObject{
    private String title;
    private String university;
    private String degree;
    private String city;
    private Date dateFrom;
    private Date dateTo;
    private String average;
    private Thesis thesis;

}
