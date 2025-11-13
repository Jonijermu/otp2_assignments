import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class LaskinTest {

    @Test
    public void addValues() {
        assertEquals(16, 0.1, Laskin.addValues(12, 4));
    }

    @Test
    public void subtractValue() {
        assertEquals(-8, Laskin.subtractValue(-12, -4), 0.01);

    }

    @Test
    public void multiplyValues() {
        assertEquals(24, Laskin.multiplyValues(12, 2), 0.01);
    }

    @Test
    public void divideValues() {
        assertEquals(6, Laskin.divideValues(12, 2), 0.01);
    }

}