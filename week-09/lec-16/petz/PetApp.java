package main.petz;

public class PetApp {
    public static void main(String[] args) {
        Pet[] pets = new Pet[3];

        pets[0] = new Cat("Shizu");
        // pets.add(new Fish("Mr. Bubbles"));
        // pets.add(new Dog("Haida"));

        for (Pet p : pets) {
            p.speak();
        }
    }
}
