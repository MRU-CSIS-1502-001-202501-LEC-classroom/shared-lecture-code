import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CrossCountry {

    public static void main(String[] args) throws Exception {
        System.out.print("Runner placements? ");

        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> racePlacements = new ArrayList<>();

        String placementText = keyboard.nextLine();
        while (!placementText.equals("-1")) {
            racePlacements.add(placementText);
            placementText = keyboard.nextLine();
        }

        System.out.println("Done reading!");

        PrintWriter writer = new PrintWriter("res/race-results.txt");
        for (String placement : racePlacements) {
            writer.println(placement);
        }

        writer.close();

    }
}