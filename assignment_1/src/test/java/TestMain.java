import org.junit.jupiter.api.Test;
import java.util.Locale;
import java.util.ResourceBundle;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class TestMain {

    @Test
    public void testEnglishBundle() {
        ResourceBundle rb = ResourceBundle.getBundle("languages", new Locale("en", "US"));
        assertNotNull("Enter the number of items to purchase:", rb.getString("a"));
    }

    @Test
   public  void testFinnishBundle() {
        ResourceBundle rb = ResourceBundle.getBundle("languages", new Locale("fi", "FI"));
        assertNotNull("Syötä ostettavien tuotteiden määrä:", rb.getString("a"));
    }

    @Test
    public void testSwedishBundle() {
        ResourceBundle rb = ResourceBundle.getBundle("languages", new Locale("sv", "SE"));
        assertNotNull("Ange antalet varor att köpa:", rb.getString("a"));
    }

    @Test
    public void testJapaneseBundle() {
        ResourceBundle rb = ResourceBundle.getBundle("languages", new Locale("ja", "JP"));
        assertNotNull("「購入する商品の数を入力してください:」", rb.getString("a"));
    }

}
