package main.trace;

import main.exceptions.ScaryCheckedException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start main");
        String goBoom = "no";
        SomeClass classy = new SomeClass();

        try {
            System.out.println("Start try block");
            classy.doRisky(goBoom);
            System.out.println("End try block");
            return;

        } catch (ScaryCheckedException ex) {
            System.out.println("Caught a scary exception");
        } finally {
            System.out.println("Ran finally");
        }

        System.out.println("End main");
    }
}