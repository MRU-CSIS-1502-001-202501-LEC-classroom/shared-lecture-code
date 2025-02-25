public class TapeMeasureApp {
    public static void main(String[] args) {
        TapeMeasure tapey = new TapeMeasure();
        TapeMeasure tapeyMaximus = new TapeMeasure(24);

        System.out.println(tapey.toString());
        tapey.extend(7);

        System.out.println(tapey);
    }

}