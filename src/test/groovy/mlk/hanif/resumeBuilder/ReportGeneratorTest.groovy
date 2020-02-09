package mlk.hanif.resumeBuilder

import spock.lang.Specification

class ReportGeneratorTest extends Specification {

    def "test getOutputFileName"() {
        given:
        ReportGenerator reportGenerator = new ReportGenerator(null, "txt", "folder")
        when:
        String outputFillename = reportGenerator.getOutputFileName(inputFileName)
        then:
        outputFillename == expectedOutputFilename
        where:
        inputFileName                                                                  | expectedOutputFilename
        "test.vm"                                                                      | "generated/folder/test.txt"
        "test.txt.vm"                                                                  | "generated/folder/test.txt.txt"
        "test.vm.vm"                                                                   | "generated/folder/test.vm.txt"
        "D:/Hanif/workspace/mlk.hanif.resumeBuilder/build/resources/main/Templates/test/test.vm" | "generated/folder/D:/Hanif/workspace/mlk.hanif.resumeBuilder/build/resources/main/Templates/test/test.txt"
    }
}
