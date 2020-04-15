import java.util.List;

public interface ScoreComputable {
    public int calculateEachScore(Person person);
    public long calculateTotalScore(List<Person> person);
}
