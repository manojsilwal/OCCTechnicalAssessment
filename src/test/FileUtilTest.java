package test;

import main.FileUtil;
import org.junit.Assert;
import org.junit.Test;

public class FileUtilTest {
    public FileUtilTest() {
    }

    @Test
    public void readTextFromFile_returnsStringFromFile() {
        String text = FileUtil.readTextFromFile("C:\\Users\\manoj\\Downloads\\OCCTechnicalAssessment\\src\\names.txt");
        Assert.assertFalse(text.isBlank());
    }
}