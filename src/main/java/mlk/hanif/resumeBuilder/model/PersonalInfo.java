package mlk.hanif.resumeBuilder.model;

import lombok.Data;

import java.util.Date;

@Data
public class PersonalInfo {
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
