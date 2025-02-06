public class TapeMeasure {

    private int currReading;
    private int maxReading;

    public TapeMeasure() {
        currReading = 0;
        maxReading = 12 * 12;
    }

    public void extend(int inches) {
        currReading += inches;
    }

    public int getCurrReading() {
        return currReading;
    }

}