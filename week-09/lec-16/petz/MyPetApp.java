package main.petz;

import java.io.File;
import java.util.Scanner;

public class MyPetApp {

    public static void main(String[] args) throws Exception {
        File f = new File("res/mypets.txt");
        Scanner petFileScanner = new Scanner(f);

        PetOwner beto = new PetOwner("Beto");

        while (petFileScanner.hasNextLine()) {
            String petLine = petFileScanner.nextLine();

            int indexOfSpace = petLine.indexOf(" ");
            String typeOfPet = petLine.substring(0, indexOfSpace);
            String petName = petLine.substring(indexOfSpace + 1);

            if (typeOfPet.equals("dog")) {
                beto.adopt(new Dog(petName));
            } else if (typeOfPet.equals("cat")) {
                beto.adopt(new Cat(petName));
            } else if (typeOfPet.equals("fish")) {
                beto.adopt(new Fish(petName));
            } else {
                beto.adopt(new Bird(petName));
            }
        }

        petFileScanner.close();

        beto.holdPetMeeting();
    }

}
