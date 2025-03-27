package main.runtimedemo;

import java.util.ArrayList;

public class SomeUsefulClass {
    private ArrayList<String> listOfStuff;
    private ArrayList<String> otherListOfStuff;

    public SomeUsefulClass() {
        listOfStuff = new ArrayList<>();
        listOfStuff.add("stuff");
        listOfStuff.add("");
    }

    public char grabFirstCharFromStuff(int stuffIndex) {
        String stuff = listOfStuff.get(stuffIndex);
        return stuff.charAt(0);
    }

    public void displayStuff(int stuffIndex) {
        String stuff = listOfStuff.get(stuffIndex);
        System.out.printf("Here's the stuff you wanted at index %f: %s%n", stuffIndex, stuff);
    }

    public String getOtherStuff(int stuffIndex) {
        return otherListOfStuff.get(stuffIndex);
    }

    public int getMagicStringNumber(String s) {
        if (s.isEmpty()) {
            throw new IllegalArgumentException("Empty strings aren't magical at all. Get that thing away from me.");
        }

        return 2 * s.length();
    }

}
