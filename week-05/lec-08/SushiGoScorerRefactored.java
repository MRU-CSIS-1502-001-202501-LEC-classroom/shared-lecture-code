import java.util.Scanner;

public class SushiGoScorerRefactored {

    private static final int MAX_DUMPLING_SCORE = 15;
    private static final int PTS_PER_TEMPURA_PAIR = 5;

    public static void main(String[] args) {
        SushiGoScorerRefactored app = new SushiGoScorerRefactored();
        app.run();
    }

    public void run() {

        int numTempuraCards = getNumCardsFromUser("Num tempura cards? ");
        int tempuraScore = tempuraScoreFor(numTempuraCards);
        displayScore("Tempura", tempuraScore);

        int numDumplingCards = getNumCardsFromUser("Num dumpling cards? ");
        int dumplingScore = dumplingScoreFor(numDumplingCards);
        displayScore("Dumpling", dumplingScore);
    }

    public void displayScore(String label, int score) {
        String namedLabel = label + " score:";
        System.out.printf("%-20s %3d%n", namedLabel, score);
    }

    public int getNumCardsFromUser(String prompt) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print(prompt);
        int numCards = keyboard.nextInt();

        return numCards;
    }

    public int tempuraScoreFor(int numTempuraCards) {
        int numTempuraPairs = numTempuraCards / 2;
        int tempuraScore = numTempuraPairs * PTS_PER_TEMPURA_PAIR;

        return tempuraScore;
    }

    public int dumplingScoreFor(int numDumplingCards) {
        int rawDumplingScore = (numDumplingCards + 1) * numDumplingCards / 2; // Triangle number trick.
        int dumplingScore = Math.min(rawDumplingScore, MAX_DUMPLING_SCORE);

        return dumplingScore;
    }
}