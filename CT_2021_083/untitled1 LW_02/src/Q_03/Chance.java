package Q_03;
import java.util.Scanner;

public class Chance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert to Fahrenheit
        double fahrenheit = (1.8 * celsius) + 32;

        // Print the result
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}

