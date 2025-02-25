public class TapeMeasure {

    private static final int INCHES_PER_FOOT = 12;
    private static final int DEFAULT_SIZE_IN_FEET = 12;

    private int currReading;
    private final int maxReading;

    public TapeMeasure() {
        currReading = 0;
        maxReading = INCHES_PER_FOOT * DEFAULT_SIZE_IN_FEET;
    }

    public TapeMeasure(int maxReading) {
        this.maxReading = INCHES_PER_FOOT * maxReading;
        currReading = 0;
    }

    public TapeMeasure(TapeMeasure otherTapeMeasure) {
        this.currReading = otherTapeMeasure.currReading;
        this.maxReading = otherTapeMeasure.maxReading;
    
    }

    public int getMaxReading() {
        return maxReading;
    }

    public void extend(int inches) {
        currReading += inches;
    }

    public void retract() {
        currReading = 0;
    }

    public void retract(int inches) {
        currReading -= inches;
    }

    public int getCurrReading() {
        return currReading;
    }

    @Override
    public String toString() {
        return "TM has currReading = " + currReading;
    }
}
