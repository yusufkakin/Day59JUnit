import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageMethodTest {

    @Test
    void sum() {
        assertEquals(6, AverageMethod.sum(2, 2, 2));
    }

    @Test
    void average() {
        assertEquals(2, AverageMethod.average(2,2,2));
    }
}