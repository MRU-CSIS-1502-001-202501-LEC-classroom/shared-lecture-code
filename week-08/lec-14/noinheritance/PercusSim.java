package main.noinheritance;

public class PercusSim {

    public static void main(String[] args) {
        Instrument timpani = new Instrument(
                "timpani",
                InstrumentShape.HOLLOW_HEMISPHERE,
                MembraneMaterial.ANIMAL_HIDE,
                BodyMaterial.METAL,
                new GraphicModel("timpani"));

        System.out.println("Simulating timpani playing...");
        timpani.render();
        timpani.makeSound();

        System.out.println();

        Instrument marimba = new Instrument(
                "marimba",
                InstrumentShape.HOLLOW_TUBE,
                null,
                BodyMaterial.WOOD,
                new GraphicModel("marimba"));

        System.out.println("Simulating marimba playing...");
        marimba.render();
        marimba.makeSound();

        System.out.println();

        Instrument coffeeMug = new Instrument(
                "coffeeMug",
                InstrumentShape.HOLLOW_TUBE,
                null,
                BodyMaterial.CERAMIC,
                new GraphicModel("coffeeMug"));

        System.out.println("Simulating coffeeMug playing...");
        coffeeMug.render();
        coffeeMug.makeSound();
    }
}
