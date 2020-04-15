package test;

import main.FirstNameComparator;
import main.Person;
import main.ScoreCalculator;
import main.ScoreComputable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ScoreCalculatorTest {

    ScoreComputable scoreComputable;

    @Before
    public void setUp() {
        this.scoreComputable = new ScoreCalculator();
    }

    @Test
    public void calculateEachScore_returnsComputedScoreForFirstName() {
        int lindaScore = this.scoreComputable.calculateEachScore(new Person("LINDA"));
        Assert.assertEquals(40L, (long)lindaScore);
    }

    @Test
    public void calculateEachScore_returns0WhenParameterIsNull() {
        int nullScore = this.scoreComputable.calculateEachScore((Person)null);
        Assert.assertEquals(0L, (long)nullScore);
    }

    @Test
    public void calculateTotalScore_returnsScoreOfAllNamesFromParameter() {
        List<Person> sortedName = (List) Arrays.asList("MARY", "PATRICIA", "LINDA", "BARBARA", "VINCENZO", "SHON", "LYNWOOD", "JERE", "HAI").stream().map((name) -> {
            return new Person(name);
        }).sorted(new FirstNameComparator()).collect(Collectors.toList());
        long totalScore = this.scoreComputable.calculateTotalScore(sortedName);
        Assert.assertEquals(3194L, totalScore);
    }

    @Test
    public void calculateTotalScore_returnsScoreOfEmptyList() {
        long totalScore = this.scoreComputable.calculateTotalScore(Collections.emptyList());
        Assert.assertEquals(0L, totalScore);
    }

    @Test
    public void calculateTotalScore_returnsScoreOfNull() {
        long totalScore = this.scoreComputable.calculateTotalScore(Collections.emptyList());
        Assert.assertEquals(0L, totalScore);
    }
}