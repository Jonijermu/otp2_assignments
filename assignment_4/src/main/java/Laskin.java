import java.util.Scanner;
import java.util.logging.Logger;

public class Laskin {
    private static final Logger logger = Logger.getLogger(Laskin.class.getName());

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        logger.info(() -> "Enter first number:");
        double num1 = input.nextDouble();

        logger.info(() -> "Enter second number:");
        double num2 = input.nextDouble();

        runCalculator(num1, num2);

        input.close();
    }

    public static void runCalculator(double num1, double num2) {
        String resultDes = "Result is: %.2f";

        double result1 = addValues(num1, num2);
        logger.info(() -> String.format("Add: " + resultDes, result1));

        double result2 = subtractValue(num1, num2);
        logger.info(() -> String.format("Subtract: " + resultDes, result2));

        double result3 = multiplyValues(num1, num2);
        logger.info(() -> String.format("Multiply: " + resultDes, result3));

        double result4 = divideValues(num1, num2);
        logger.info(() -> String.format("Divide: " + resultDes, result4));
    }

    // Arithmetic methods
    public static double addValues(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtractValue(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplyValues(double num1, double num2) {
        return num1 * num2;
    }

    public static double divideValues(double num1, double num2) {
        return num1 / num2;
    }
}
