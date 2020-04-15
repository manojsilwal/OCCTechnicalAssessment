package main;

import java.util.List;

public interface ScoreComputable {
    int calculateEachScore(Person person);
    long calculateTotalScore(List<Person> person);
}
