public class CrossCountryScorer {

    public static void main(String[] args) {
        System.out.print("Runner results? ");

        Scanner keyboard = new Scanner(System.in);
        // Make an ArrayList<String> that holds placements.

        // What kind of loop was this again?
        String placement = keyboard.nextLine();
        while (!placement.equals("-1")) {
            // Add the placement to the ArrayList. How do we do that?
            placement = keyboard.nextLine();
        }

        // We eventually want to do the following:

        // Prompt for a team.
        // Get a team from the user.
        // Walk through all the placements:   (I'd use an enhanced for loop here.)
        //   If you find the desired team....(you continue from here)

        System.out.println("Done reading!");
    }
}