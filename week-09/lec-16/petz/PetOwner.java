package main.petz;

import java.util.ArrayList;

public class PetOwner {
    private String name;
    private ArrayList<Pet> pets;

    public static void main(String[] args) {
        PetOwner owner = new PetOwner("KJ");

        owner.adopt(new Dog("Shadow"));
        owner.adopt(new Dog("John"));
        owner.adopt(new Cat("Soni"));
        owner.adopt(new Fish("Mr. Bubbles"));

        owner.holdPetMeeting();
    }

    public PetOwner(String name) {
        this.name = name;
        pets = new ArrayList<>();
    }

    public void adopt(Pet pet) {
        pets.add(pet);
    }

    public void chat(Pet pet) {
        pet.speak();
    }

    public void holdPetMeeting() {
        for (Pet p : pets) {
            p.speak();
        }
    }
}
