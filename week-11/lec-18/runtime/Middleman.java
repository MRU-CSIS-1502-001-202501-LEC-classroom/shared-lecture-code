package main.runtime;

public class Middleman {

    public static void passItOn() {
        System.out.println("passItOn() started");
        Boomable.blowUp();
        System.out.println("done passItOn()");
    }
}
