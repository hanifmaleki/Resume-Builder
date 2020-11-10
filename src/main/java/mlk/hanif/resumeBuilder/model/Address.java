package mlk.hanif.resumeBuilder.model;

import lombok.Data;

@Data
public class Address extends BaseResumeObject{
    private String country;
    private String city;
    private String street;
    private String postalCode;
}
