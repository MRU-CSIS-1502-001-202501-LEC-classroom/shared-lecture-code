public class TapeMeasureApp {
    public static void main(String[] args) {
        TapeMeasure tapey = new TapeMeasure();
        TapeMeasure tapeyMaximus = new TapeMeasure(24);

        System.out.println("tapey has maxReading: " + tapey.getMaxReading());
        System.out.println("tapeyMaximus has maxReading: " + tapeyMaximus.getMaxReading());

    }

}