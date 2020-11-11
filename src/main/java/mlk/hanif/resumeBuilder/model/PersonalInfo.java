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
public class PersonalInfo extends BaseResumeObject{
    private String title;
    private String name;
    private String family;
    private String nationality;
    private Date birthDate;
    private String birthPlace;
    private String phone;
    private String email;
    private Address address;
    private String linkedIn;
    private String gitHub;

}
