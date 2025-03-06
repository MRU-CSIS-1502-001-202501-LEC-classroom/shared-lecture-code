package main.yesinheritance;

public class PercusSim {

        public static void main(String[] args) {
                Idiophone marimba = new Idiophone(
                                "marimba",
                                InstrumentShape.HOLLOW_HEMISPHERE,
                                BodyMaterial.METAL,
                                new GraphicModel("marimba"));

                System.out.println("Simulating marimba playing..." + marimba.toString());
                marimba.render();
                marimba.makeSound();

                System.out.println();

        }
}
