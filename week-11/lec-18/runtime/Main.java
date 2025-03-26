package main.runtime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start main");

        throw new SuperBadException("Soooooo bad!");
    }
}
