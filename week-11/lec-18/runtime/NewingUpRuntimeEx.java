package main.runtime;

public class NewingUpRuntimeEx {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("---- NO ARG EXCEPTION ----");

        IllegalArgumentException exNoArg = new IllegalArgumentException();
        System.out.println("toString(): " + exNoArg);
        System.out.println("getMessage(): " + exNoArg.getMessage());
        System.out.println("stack trace:");
        exNoArg.printStackTrace();

        System.out.println();
        System.out.println("---- WITH MSG EXCEPTION ----");

        IllegalArgumentException exWithMsg = new IllegalArgumentException("What the heck, dude?!?");
        System.out.println("toString(): " + exWithMsg);
        System.out.println("getMessage(): " + exWithMsg.getMessage());
        System.out.println("stack trace:");
        exWithMsg.printStackTrace();

    }
}
