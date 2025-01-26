public class SushiGoScorer {

    // Bring in some constants! But only the ones you need.

    public static void main(String[] args) {
        System.out.print("Num tempura cards? ");

        int numTempuraCards = keyboard.nextInt();
        int numTempuraPairs = numTempuraCards / 2; // Any magic numbers?
        int tempuraScore = numTempuraPairs * 5; // Any magic numbers?

        System.out.println("Tempura score: " + tempuraScore);

        // Why not try doing the dumpling scoring as well - and add necessary constants!
    }
}