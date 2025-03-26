package main.trace;

import main.exceptions.ScaryCheckedException;

public class SomeClass {

    public void doSafe() {
        System.out.println("Start doSafe");
        System.out.println("End doSafe");
    }

    public void doRisky(String goBoom) throws ScaryCheckedException {
        System.out.println("Start doRisky");

        if (goBoom.equals("yes")) {
            throw new ScaryCheckedException();
        }
        System.out.println("End doRisky");
    }
}
