package main.critter;

import java.util.ArrayList;

public class CritterGame {
    public static void main(String[] args) {
        ArrayList<Critter> critters = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            critters.add(new Critter());
        }

        System.out.println("There are " + Critter.numCritters() + " critters.");

        for (Critter critter : critters) {
            System.out.println(critter);
        }

        Critter.setMood("🥲");
        for (int i = 1; i <= 3; i++) {
            critters.add(new Critter());
        }

        System.out.println("There are " + Critter.numCritters() + " critters.");

        for (Critter critter : critters) {
            System.out.println(critter);
        }
    }
}
