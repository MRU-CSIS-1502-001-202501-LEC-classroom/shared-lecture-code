package main.critter;

public class Critter {
    private static final String[] LOCATIONS = { "Forest", "Swamp", "Mountains", "Plains", "City" };

    private static String mood = "😁";
    private static int numSpawned = 0;

    private String location;

    public Critter() {
        location = LOCATIONS[numSpawned % LOCATIONS.length];
        numSpawned++;
    }

    @Override
    public String toString() {
        return String.format("%s  [%s]", mood, location);
    }

    public static int numCritters() {
        return numSpawned;
    }

    public static void setMood(String mood) {
        Critter.mood = mood;
    }
}
