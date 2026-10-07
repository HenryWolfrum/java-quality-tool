import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void addTwoNumbers() {
        assertEquals(5, Main.add(2, 3));
    }

    @Test
    void negativeFirstNumberReturnsMinusOne() {
        assertEquals(-1, Main.add(-2, 3));
    }
}