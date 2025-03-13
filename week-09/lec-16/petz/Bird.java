package main.petz;

public class Bird extends Pet {

    public Bird(String name) {
        super(name);
    }

    public void speak() {
        System.out.println(getName() + " says 'Chirp!'");
    }

    public void eat() {
        System.out.println(getName() + " eats a bird.");
    }
}
