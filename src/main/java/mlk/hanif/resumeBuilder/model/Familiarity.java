package mlk.hanif.resumeBuilder.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Familiarity {
    private final String familiarity;
    private final Integer degree;

    public Familiarity(String familiarity) {
        switch(familiarity){
            case "Very Good":
                this.degree = 5;
                break;
            case "Good":
                this.degree = 4;
                break;
            case "Familiar":
                this.degree = 3;
                break;
            case "Basic":
                this.degree = 2;
                break;
            case "Heard":
                this.degree = 1;
                break;
            default:
                //TODO make the application valid exception
                throw new RuntimeException("Invalid Familiarity "+ familiarity);
        }
        this.familiarity = familiarity;
    }
}
