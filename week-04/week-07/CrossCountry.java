import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CrossCountry {

    public static void main(String[] args) throws Exception {
        System.out.print("Runner placements? ");

        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> racePlacements = new ArrayList<>();
        File file = new File("res/race-results.txt");
        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNextLine()) {
            String currPlacement = fileScanner.nextLine();
            racePlacements.add(currPlacement);
        }

        fileScanner.close();

        System.out.println("Done reading!");

        PrintWriter writer = new PrintWriter("res/race-results.txt");
        for (String placement : racePlacements) {
            writer.println(placement);
        }

        writer.close();

        // 🎯 Now write everything in the ArrayList to a file.
    }
}