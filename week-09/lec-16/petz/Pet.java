package main.petz;

import java.util.ArrayList;

public abstract class Pet {
    private String name;
    private ArrayList<String> activities;

    public static void main(String[] args) {
        Pet huh = new Pet("huh");
        huh.speak();
        huh.eat();
    }

    public Pet(String name) {
        this.name = name;
        activities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void doThis(String activity) {
        activities.add(activity);
    }

    public abstract void speak();

    public abstract void eat();
}