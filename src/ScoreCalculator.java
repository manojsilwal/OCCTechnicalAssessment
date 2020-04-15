import java.util.List;

public class ScoreCalculator implements ScoreComputable {
    @Override
    public int calculateEachScore(Person person) {
        if(person == null){
            return 0;
        }
        char[] charArray = person.getFirstName().toUpperCase().toCharArray();
        int score = 0;
        for (int asciiVal: charArray){
            score  += (asciiVal-64);
        }
        return score;
    }

    @Override
    public long calculateTotalScore(List<Person> personList) {
        int totalScore = 0;
        int eachScoreTotal;
        for (int i=0;i<personList.size();i++){
            eachScoreTotal = calculateEachScore(personList.get(i));
            totalScore += eachScoreTotal*(i+1);
        }
        return totalScore;
    }
}
