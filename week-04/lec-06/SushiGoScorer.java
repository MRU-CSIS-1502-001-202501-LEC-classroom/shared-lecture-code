import java.util.Scanner;

public class SushiGoScorer {

    private static final int MAX_DUMPLING_SCORE = 15;
    private static final int PTS_PER_TEMPURA_PAIR = 5;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Num tempura cards? ");

        int numTempuraCards = keyboard.nextInt();
        int tempuraScore = tempuraScore(numTempuraCards); // ⚠️ This is still invalid. We'll get to why later.

        System.out.println("Tempura score: " + tempuraScore);

        System.out.print("Num dumpling cards? ");

        // 🎯Turn these next three lines into a method.
        int numDumplingCards = keyboard.nextInt();
        int rawDumplingScore = (numDumplingCards + 1) * numDumplingCards / 2; // Triangle number trick.
        int dumplingScore = Math.min(rawDumplingScore, MAX_DUMPLING_SCORE);

        System.out.println("Dumpling score: " + dumplingScore);
    }

    public int tempuraScore(int numTempuraCards) {
        int numTempuraPairs = numTempuraCards / 2;
        int tempuraScore = numTempuraPairs * PTS_PER_TEMPURA_PAIR;

        return tempuraScore;
    }

}