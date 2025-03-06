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

        System.out.println("Simulating marimba playing...");
        Instrument marimba = new Instrument(
                "marimba",
                InstrumentShape.HOLLOW_TUBE,
                null,
                BodyMaterial.WOOD,
                new GraphicModel("marimba"));

        marimba.render();
        marimba.makeSound();

        System.out.println();

        System.out.println("Simulating gong playing...");
        Instrument gong = new Instrument(
                "gong",
                InstrumentShape.SHALLOW_BOWL,
                null,
                BodyMaterial.METAL,
                new GraphicModel("gong"));

        gong.render();
        gong.makeSound();
    }
}
