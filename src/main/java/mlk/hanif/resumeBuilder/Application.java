package mlk.hanif.resumeBuilder;

import mlk.hanif.resumeBuilder.model.Resume;

import java.net.URISyntaxException;

public class Application {

    public static void main(String[] args) {
        ContextMaker contextMaker = new ContextMaker();
        Resume resume = contextMaker.getContext();
        ReportGenerator reportGenerator = new ReportGenerator(resume, "tex", "test");

        try {
            reportGenerator.generateReport();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (WrongDirectoryException e) {
            e.printStackTrace();
        }
    }

}
