package main;

public class TapeMeasureApp {
    public static void main(String[] args) {
        TapeMeasure tapey = new TapeMeasure();
        TapeMeasure t2 = new TapeMeasure();

        if (tapey == t2) {
            System.out.println("Yay! Twins!");
        } else {
            System.out.println("nope");
        }
    }

}