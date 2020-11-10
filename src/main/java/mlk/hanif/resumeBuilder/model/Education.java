package mlk.hanif.resumeBuilder.model;

import lombok.Data;

import java.util.Date;
@Data
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
