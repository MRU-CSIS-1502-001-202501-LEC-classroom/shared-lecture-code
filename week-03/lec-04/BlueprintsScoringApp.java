import java.util.ArrayList;

public class BlueprintsScoringApp {

    private static final String BUILDING_PATH = "res/building.txt";
    private static final String RESULTS_PATH = "res/scoring-results.txt";

    /**
     * Reads a Blueprints "building" from res/building.txt, scores the
     * materials in that building, and writes the result to res/scoring-results.txt.
     * 
     * @param args any command line arguments
     */
    public void run() throws Exception {
        ArrayList<ArrayList<String>> building = getBuildingFromFile(BUILDING_PATH);
        writeResultsToFile(building, RESULTS_PATH);
    }

    public static void main(String[] args) {
        BlueprintsScoringApp app = new BlueprintsScoringApp();

        ArrayList<ArrayList<String>> building = new ArrayList<>();
        
        int result = app.getGlassScore(building);

        System.out.println("Result is: " + result);

    }

    // Students will generate documentation for this method.
    // If the building file is empty, the return value should be an EMPTY
    // ArrayList<ArrayList<String>> and NOT null!
    //
    // Also, the elements in the outer ArrayList are expected to be in "top of the
    // building
    // to the bottom of the building order". That is, the 0th element in that
    // ArrayList
    // must be the top row of the dice in the building and the size-1 element must
    // be the
    // bottom row. This will make some scoring harder, but is necessary for testing
    // purposes, so I'm afraid you'll just have to learn to deal with it!
    public ArrayList<ArrayList<String>> getBuildingFromFile(String buildingFilePath) throws Exception {

        // Create a scanner that connects to the desired building file.
        // Don't forget to use the correct path!

        // Create an ArrayList of Strings to hold the various lines in the file.

        // While there are still lines in the file to read, read the next line
        // and add it to the ArrayList you made.

        // Don't forget to close your Scanner!

        // Now for the fun part.
        // Create an ArrayList that holds ArrayLists of strings - this will represent
        // the building. The "inner" ArrayLists will hold the "rows" of dice that make
        // up
        // that building.

        // For every line you read from the file:
        // 1. Create a new ArrayList of Strings to hold the row of dice.
        // 2. Split the line on the correct delimiter (what would that be?).
        // 3. For every String resulting from that split:
        // 3a. Add that String (representing a die) into the ArrayList of Strings.
        // 4. Add that row of dice to the building.

        // Don't forget: return the building!

        return new ArrayList<ArrayList<String>>();
    }

    /**
     * Writes the building to score and that building's score details to
     * res/scoring-results.txt.
     * 
     * The details are as follows:
     * <ul>
     * <li>If the incoming building is empty, the output file contains the text "No
     * building present."</li>
     * <li>If the incoming building is not empty, the output file contains:</li>
     * <ol>
     * <li>The text version of the building being scored.</li>
     * <li>A blank line.</li>
     * <li>A formatted scoring table, as specified in the assignment.
     * </ol>
     * </ul>
     * 
     * @param building the building to score
     * @throws Exception
     */
    public void writeResultsToFile(ArrayList<ArrayList<String>> building, String resultsPath) throws Exception {
        // Your awesome code goes here.
    }

    /**
     * Returns the score for the glass dice in the provided building.
     * 
     * From page 4 of the rulebook: "Score each clear die individually;
     * the clear die being scored is worth the value of its top face."
     * 
     * @param building the building to score
     * @return the glass materials score
     */
    public int getGlassScore(ArrayList<ArrayList<String>> building) {
        // This one is the easiest one, I'd say.

        return 0;
    }

    /**
     * Returns the score for the recycled dice in the provided building.
     * 
     * From page 4 of the rulebook: "Score a total of 2/5/10/15/20/30 points
     * for using a total of 1/2/3/4/5/6 green dice."
     * 
     * @param building the building to score
     * @return the recycled materials score
     */
    public int getRecycledScore(ArrayList<ArrayList<String>> building) {
        // Get recycling!
        return 0;
    }

    /**
     * Returns the score for the stone dice in the provided building.
     * 
     * From page 4 of the rulebook: "Score each black die individually;
     * the black die being scored is worth 2/3/5/8 points for being on
     * the 1st/2nd/3rd/4th (or higher) level of a building."
     * 
     * @param building the building to score
     * @return the stone materials score
     */
    public int getStoneScore(ArrayList<ArrayList<String>> building) {
        // You're on your own here!
        return 0;
    }

    /**
     * Returns the score for the wood dice in the provided building.
     * 
     * From page 4 of the rulebook: "Score each orange die individually;
     * score 2 points per die adjacent to the orange die being scored.
     * Dice are adjacent if they share a face."
     * 
     * @param building the building to score
     * @return the wood materials score
     */
    public int getWoodScore(ArrayList<ArrayList<String>> building) {
        // Here's an algorithm that works.
        // If you come up with another that functions properly,
        // feel free to use that!

        // 1. Initialize a variable to hold the wood score.
        // 2. Initialize another variable to hold the "height" of the building -
        // that is, how many rows of dice are in the building.
        // 3. Create a nested for loop that accesses each die in building by (row, col):
        // 3a. If the die at (row, col) is a wood die, calculate how many other
        // dice are touching that wood die. I would personally suggest
        // creating a helper method to do this, but it's your code.
        // 3b. Add 2 * the number calculated in 3a to the wood score variable.
        // 4. Return the wood score.
        return 0;
    }

    /**
     * Returns a formatted table of material scores, as well as a total score.
     * 
     * Assumption: No individual score, or total score, will have more than two
     * digits.
     * 
     * @param glassScore    the glass score to display
     * @param recycledScore the recycled score to display
     * @param stoneScore    the stone score to display
     * @param woodScore     the wood score to display
     * @return the formatted table of scores
     */
    public String formattedScoringReport(int glassScore, int recycledScore, int stoneScore, int woodScore) {
        /*
         * Here's a Python solution to this:
         * 
         * total = glassScore + recycledScore + stoneScore + woodScore
         * 
         * scores = "+----------+----+\n"
         * scores += f"{'| glass':10} | {glassScore:>2} |\n"
         * scores += f"{'| recycled':10} | {recycledScore:>2} |\n"
         * scores += f"{'| stone':10} | {stoneScore:>2} |\n"
         * scores += f"{'| wood':10} | {woodScore:>2} |\n"
         * scores += "+==========+====+\n"
         * scores += f"{'| total':10} | {total:>2} |\n"
         * scores += "+----------+----+\n"
         * 
         * return scores
         * 
         */
        return "foo";
    }
}