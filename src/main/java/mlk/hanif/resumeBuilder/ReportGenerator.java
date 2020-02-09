package mlk.hanif.resumeBuilder;

import mlk.hanif.resumeBuilder.model.Resume;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.tools.generic.DateTool;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ReportGenerator {
    //TODO move to a config file
    public static final String TEMPLATES_DIR = "Templates/";
    final DateTool dateTool = new DateTool();
    private String templateFolderName;
    private VelocityEngine velocityEngine;
    private VelocityContext velocityContext;
    private String extension;

    public ReportGenerator(Resume context, String extension, String templateFolderName) {
        this.extension = extension;
        this.templateFolderName = templateFolderName;
        initializeVelocityEngine();
        initializeVelocityContext(context);
    }

    private void initializeVelocityContext(Resume context) {
        velocityContext = new VelocityContext();
        velocityContext.put("resume", context);
        velocityContext.put("dateTool", dateTool);
    }

    private void initializeVelocityEngine() {
        velocityEngine = new VelocityEngine();
        velocityEngine.init();
    }

    public void generateReport() throws URISyntaxException, WrongDirectoryException {
        String resourcePath = TEMPLATES_DIR + templateFolderName;
        File file = getFile(resourcePath);
        Arrays.asList(file.listFiles((dir, name) -> name.endsWith(".vm"))).stream().forEach(template ->
        {
            String relativeTemplateFileName = "build/resources/main/" + resourcePath + "/" + template.getName();
            String outputFileName = getOutputFileName(template.getName());
            writeContext(relativeTemplateFileName, outputFileName);
        });
    }

    private File getFile(String resourcePath) throws URISyntaxException, WrongDirectoryException {
        URL resource = getClass().getClassLoader().getResource(resourcePath);
        File file = new File(resource.toURI());
        checkDirectoryIsCorrect(file);
        return file;
    }

    private void checkDirectoryIsCorrect(File file) throws WrongDirectoryException {
        if (!file.exists()) {
            throw new WrongDirectoryException("Could not find the input folder");
        }
        if (!file.isDirectory()) {
            throw new WrongDirectoryException("The specified is not a directory");
        }
    }

    public void writeContext(String templateFileName, String outputFileName) {

        Template template = velocityEngine.getTemplate(templateFileName);

        StringWriter writer = new StringWriter();
        template.merge(velocityContext, writer);
        try {
            Path path = Paths.get(outputFileName);
            path.getParent().toFile().mkdirs();
            if (!path.toFile().exists()) {
                Files.createFile(path);
            }
            Files.write(path, writer.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private String getOutputFileName(String templateFileName) {
        //It is assumed that filename ends with .vm
        return String.format("generated/%s/%s%s%s", templateFolderName, templateFileName.substring(0, templateFileName.length() - 3), ".", extension);
    }

}
