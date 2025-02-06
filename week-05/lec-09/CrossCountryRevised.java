
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CrossCountryRevised {

    public static void main(String[] args) throws Exception {
        CrossCountryRevised app = new CrossCountryRevised();
        app.run();
    }

    public void run() throws Exception {
        ArrayList<String> placements = getPlacements("res/race-placements.txt");
        writePlacements(placements, "res/race-resultst.txt");
    }

    public ArrayList<String> getPlacements(String filePath) throws Exception {
        ArrayList<String> racePlacements = new ArrayList<>();
        File file = new File("res/race-results.txt");
        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNextLine()) {
            String currPlacement = fileScanner.nextLine();
            racePlacements.add(currPlacement);
        }
        fileScanner.close();

        return racePlacements;
    }

    public void writePlacements(ArrayList<String> racePlacements, String resultPath) throws Exception {
        PrintWriter writer = new PrintWriter(resultPath);
        for (String placement : racePlacements) {
            writer.println(placement);
        }
        writer.close();
    }

}