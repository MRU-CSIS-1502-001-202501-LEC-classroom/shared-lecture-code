package main.petz;

public class Fish extends Pet {

    public static void main(String[] args) {
        Fish mrBubbles = new Fish("Mr. Bubbles");
        mrBubbles.speak();
        mrBubbles.eat();
    }

    public Fish(String name) {
        super(name);
    }

    public void speak() {
        System.out.println(getName() + " says 'bloop!'");
    }

    public void eat() {
        System.out.println(getName() + " eats a fish flake.");
    }

}
