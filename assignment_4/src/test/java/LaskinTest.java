import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LaskinTest {

    @Test
    public void testAddValues() {
        assertEquals(7, Laskin.addValues(3, 4));
        assertEquals(-1, Laskin.addValues(-3, 2));
    }

    @Test
    public void testSubtractValue() {
        assertEquals(-1, Laskin.subtractValue(3, 4));
        assertEquals(-5, Laskin.subtractValue(-3, 2));
    }

    @Test
    public void testMultiplyValues() {
        assertEquals(12, Laskin.multiplyValues(3, 4));
        assertEquals(-6, Laskin.multiplyValues(-3, 2));
    }

    @Test
    public void testDivideValues() {
        assertEquals(2, Laskin.divideValues(8, 4));
        assertEquals(-1.5, Laskin.divideValues(-3, 2));
    }
}