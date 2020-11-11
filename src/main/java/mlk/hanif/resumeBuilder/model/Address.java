package mlk.hanif.resumeBuilder.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Address extends BaseResumeObject{
    private String country;
    private String city;
    private String street;
    private String postalCode;
}
