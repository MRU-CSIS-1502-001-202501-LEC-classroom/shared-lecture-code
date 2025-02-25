public class TrickyTapeMeasureApp {
    public static void main(String[] args) {
        TapeMeasure tapey = new TapeMeasure();

        // tell tapey to extend 10
        tapey.extend(10);

        // tell tapey to retract 2
        tapey.retract(2);

        TapeMeasure copyOfTapey = new TapeMeasure(tapey);

        copyOfTapey.extend(11);

        // print tapey with our toString
        System.out.println(tapey); // 8 

        // print copy with our toString
        System.out.println(copyOfTapey); // 19
    }

}