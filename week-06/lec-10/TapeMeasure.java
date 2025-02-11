public class TapeMeasure {

    private int currReading;
    private int maxReading;

    public TapeMeasure() {
        currReading = 0;
        maxReading = 12 * 12;
    }

    public TapeMeasure(int maxReading) {
        this.maxReading = 12 * maxReading;
        this.currReading = 0;
    }

    public void setMaxReading(int maxReading) {
        this.maxReading = maxReading;
    }

    public int getMaxReading() {
        return maxReading;
    }

    public void extend(int inches) {
        currReading += inches;
    }

    public int getCurrReading() {
        return currReading;
    }

}
