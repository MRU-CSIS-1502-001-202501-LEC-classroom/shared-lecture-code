package main.deepcopy;

import java.util.ArrayList;

public class Pet {

    private String name; // 🤔 Should this be immutable or mutable?
    private int age; // 🤔 And this?
    private ArrayList<String> todaysActivities;

    private static int numCopies = 0; // 🤔 We'll use this to track how many copies we make. Why initialize here?

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
        todaysActivities = new ArrayList<>(); // 🤔 What if we didn't have this line?
    }

    public Pet(Pet otherPet) {
        numCopies++;

        // ⚠️ Isn't it a bit weird we can access private things?
        // ❗Also...a copy constructor CAN be a *modified* copy. Midterm 2 cough cough. ❗
        this.name = otherPet.name;
        this.age = otherPet.age;
        this.todaysActivities = new ArrayList<>(otherPet.todaysActivities); // Deep copy.
    }

    public void changeNameTo(String name) {
        this.name = name;
    }

    public void getOlder() {
        this.age += 1;
    }

    public void doThis(String activity) {
        todaysActivities.add(activity);
    }

    @Override
    public String toString() {
        String activitiesAsText = todaysActivities.toString();
        activitiesAsText = activitiesAsText.replace("[", "[\n ");
        activitiesAsText = activitiesAsText.replaceAll(",", "\n");
        activitiesAsText = activitiesAsText.replace("]", "\n]");
        return String.format("%s (age %d) did this: %s%n", name, age, activitiesAsText);
    }
}