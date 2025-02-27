package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.TapeMeasure;

public class TapeMeasureTests {

    @Test
    public void constructor_should_set_currReading_and_maxReading() {
        // Given a new tape measure made with a no-arg constructor
        TapeMeasure tm = new TapeMeasure();

        // When when I ask it for its curr reading and max reading
        int currReading = tm.getCurrReading();
        int maxReading = tm.getMaxReading();

        // Then it responds with a 0 and a 144
        assertEquals(0, currReading);
        assertEquals(144, maxReading);
    }

    @Test
    public void extend_changes_currReading() {
        // Given a new default tape measure
        TapeMeasure tm = new TapeMeasure();

        // When I extend it 7 inches
        tm.extend(7);

        // Then it says its current reading is 7
        assertEquals(7, tm.getCurrReading());

        // And When I extend it another 3 inches
        tm.extend(3);

        // Then it says its current reading is 10
        assertEquals(10, tm.getCurrReading());
    }

    @Test
    public void trying_to_extend_past_max_doesnt_change_reading() {
        TapeMeasure tm = new TapeMeasure();

        tm.extend(1);

        tm.extend(10000);

        assertEquals(1, tm.getCurrReading());
    }

}
