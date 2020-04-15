package main;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ScoreCalculatorService {
    private ScoreComputable scoreComputable;
    private Comparator<Person> comparator;

    public ScoreCalculatorService(ScoreComputable scoreComputable, Comparator<Person> comparator){
        this.scoreComputable = scoreComputable;
        this.comparator = comparator;
    }

    public long getScoreFromFile(String fileName){
        String data = FileUtil.readTextFromFile(fileName);
        String[] strings = data.replace("\"","").split(",");
        List<Person> sortedList = Stream.of(strings).map(name -> new Person(name.trim()))
                .sorted(comparator)
                .collect(Collectors.toList());
        return scoreComputable.calculateTotalScore(sortedList);
    }
}
