import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {


    @Test
    public void testEnglishBundle() {
        Locale locale = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("languages", locale);
        String message = rb.getString("a");
        assertEquals("Enter the number of items to purchase:", message);

    }

    @Test
    public void testFinnishBundle() {
        Locale locale = new Locale("fi", "UFI");
        ResourceBundle rb = ResourceBundle.getBundle("languages", locale);
        String message = rb.getString("b");
        assertEquals("Syötä tuotteen hinta:", message);

    }

    @Test
    public void testSwedishBundle() {
        Locale locale = new Locale("sv", "SE");
        ResourceBundle rb = ResourceBundle.getBundle("languages", locale);
        String message = rb.getString("c");
        assertEquals("Ange mängden varor:", message);

    }

    @Test
    public void testJapaneseBundle() {
        Locale locale = new Locale("ja", "JP");
        ResourceBundle rb = ResourceBundle.getBundle("languages", locale);
        String message = rb.getString("d");
        assertEquals("「合計金額:」", message);

    }
}
