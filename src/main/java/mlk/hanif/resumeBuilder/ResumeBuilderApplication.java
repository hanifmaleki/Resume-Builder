package mlk.hanif.resumeBuilder;

import mlk.hanif.resumeBuilder.model.Resume;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.net.URISyntaxException;

@SpringBootApplication
public class ResumeBuilderApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ResumeBuilderApplication.class, args);
        /*ContextMaker contextMaker = run.getBeanFactory().getBean(ContextMaker.class);
        Resume resume = contextMaker.getContext();
        ReportGenerator reportGenerator = new ReportGenerator(resume, "tex", "test");
        try {
            reportGenerator.generateReport();
        } catch (URISyntaxException | WrongDirectoryException e) {
            e.printStackTrace();
        }*/
    }
}
