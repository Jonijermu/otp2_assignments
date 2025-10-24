import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale locale = chooseLanguage();
        ResourceBundle rb = ResourceBundle.getBundle("languages", locale);
        String messageA = rb.getString("a");
        System.out.println(messageA);
        System.out.print("> ");
        sc.useLocale(Locale.US);
        int numberOfItems = sc.nextInt();

        double total_cost = 0;

        for (int i = 1; i <= numberOfItems; i++) {
            String messageB = rb.getString("b");
            System.out.println(messageB + " " + i);
            System.out.print("> ");
            double price = sc.nextDouble();
            String messageC = rb.getString("c");
            System.out.println(messageC + " " + i + " ");
            System.out.print("> ");
            double quantity = sc.nextInt();

            total_cost += price * quantity;
        }
        String messageD = rb.getString("d");
        System.out.println(messageD + " " + total_cost);
    }

    public static Locale chooseLanguage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose language:");
        System.out.println("1. English\n2. Finnish\n3. Swedish\n4. Japanese");
        System.out.print("> ");
        int option = sc.nextInt();
        return switch (option) {
            case (1) -> new Locale("en", "US");
            case (2) -> new Locale("fi", "FI");
            case (3) -> new Locale("sv", "SE");
            case (4) -> new Locale("ja", "JP");
            default -> throw new IllegalStateException("Unexpected value: " + option);
        };


    }
}