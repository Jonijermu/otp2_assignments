import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LecTest {

    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter language");
        String language = sc.nextLine();
        System.out.println("Enter Country");
        String country = sc.nextLine();
        Locale locale = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", locale);
        String message = rb.getString("wish");
        System.out.println(message);
    }
}
