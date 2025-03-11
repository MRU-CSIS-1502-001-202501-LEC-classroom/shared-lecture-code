package main.yesinheritance;

public class PercusSim {

        public static void main(String[] args) {
                Instrument marimba = new WoodenHollowTubeIdiophone(
                                "marimba",
                                new GraphicModel("marimba"));

                System.out.println("Simulating playing the " + marimba.toString());

                marimba.render();
                marimba.makeSound();

        }
}
