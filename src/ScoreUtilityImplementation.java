public class ScoreUtilityImplementation {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Please provide file name in command line Argument" + args.length);
            System.exit(1);
        }
        ScoreCalculatorService scoreCalculatorService = new ScoreCalculatorService(new ScoreCalculator(), new FirstnameComparator());
        long score = scoreCalculatorService.getScoreFromFile(args[0]);

        System.out.println("Total Score for all the names in given file is: "+ score);
    }
}
