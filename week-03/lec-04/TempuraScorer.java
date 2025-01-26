import java.util.Scanner;

public class TempuraScorer {

    private static final int PTS_PER_PAIR = 5;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Num tempura cards? ");

        int numTempuraCards = keyboard.nextInt();
        int numTempuraPairs = numTempuraCards / 2; // Any magic numbers?
        int tempuraScore = numTempuraPairs * PTS_PER_PAIR; // Any magic numbers?

        System.out.println("Tempura score: " + tempuraScore);
    }
}