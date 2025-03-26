package main.runtime;

public class Boomable {

    public static void blowUp() {
        System.out.println("Started blowUp()");
        throw new IllegalArgumentException("Ba-boom!");
    }

}
