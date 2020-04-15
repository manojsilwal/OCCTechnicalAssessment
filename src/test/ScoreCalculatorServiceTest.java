package test;

import main.FirstNameComparator;
import main.Person;
import main.ScoreCalculator;
import main.ScoreCalculatorService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;

public class ScoreCalculatorServiceTest {
    ScoreCalculatorService scoreCalculatorService;

    @Before
    public void setUp() throws Exception {
        Comparator<Person> comparator = new FirstNameComparator();
        this.scoreCalculatorService = new ScoreCalculatorService(new ScoreCalculator(), comparator);
    }

    @Test
    public void getScoreFromFile_returnsScoreAfterCalculatingScore() {
        long scoreFromFile = this.scoreCalculatorService.getScoreFromFile("C:\\Users\\manoj\\Downloads\\OCCTechnicalAssessment\\src\\names.txt");
        Assert.assertEquals(scoreFromFile, 871198282L);
    }
}