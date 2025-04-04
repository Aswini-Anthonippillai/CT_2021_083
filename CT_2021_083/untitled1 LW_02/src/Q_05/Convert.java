package Q_05;
import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert to Celsius
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        // Print the result
        System.out.println("Temperature in Celsius: " + celsius);

        scanner.close();
    }
}

