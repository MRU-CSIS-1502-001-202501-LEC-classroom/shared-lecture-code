import java.util.ArrayList;
import java.util.Scanner;

public class CrossCountry {
    public static void main(String[] args) {
        // Let's make all our "minions" at the top here.
        ArrayList<String> placements = new ArrayList<>();
        Scanner kbd = new Scanner(System.in);

        

        // Prompt for, and grab, the first placement.
        System.out.print("Enter a placement: ");
        String placement = kbd.nextLine();

        // Add things to the ArrayList until the
        // sentinel value is seen.
        while (!placement.equals("-1")) {
            placements.add(placement);
            placement = kbd.nextLine();
        }

        System.out.println("Done loading.");

        System.out.print("Team? ");
        String targetTeam = kbd.nextLine();

        int teamScore = 0;
        for(int index = 0; index < placements.size(); index++) {
            // Make a Scanner minion to consume the parts of the
            // placements. (Remember, they look like "4213 A 8")
            String currPlacement = placements.get(index);
            Scanner placementScanner = new Scanner(currPlacement);

            placementScanner.next(); // Consume and discard the bib number - we don't need it!
            String team = placementScanner.next();
            String placeText = placementScanner.next();

            if (targetTeam.equals(team)) {
                teamScore = teamScore + Integer.parseInt(placeText); // Turn the text into an int.
            }
        }

        System.out.printf("Team %s's score is %d.%n", targetTeam, teamScore);
    }

}
