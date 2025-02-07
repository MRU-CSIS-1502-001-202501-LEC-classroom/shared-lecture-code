public class TapeMeasureApp {
    public static void main(String[] args) {
        TapeMeasure tapey = new TapeMeasure();
        tapey.extend(15);
        int currReading = tapey.getCurrReading();
        System.out.println(currReading);
    }

}