package Q_07;
import java.util.Scanner;

public class Bmiresult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weight and height
        System.out.print("Enter your weight in kg: ");
        int weight = scanner.nextInt();

        System.out.print("Enter your height in cm: ");
        int height = scanner.nextInt();

        // Calculate BMI
        double bmi = weight / (Math.pow(height / 100.0, 2));

        // Output the result
        System.out.println("Your BMI is: " + bmi);

        scanner.close();
    }
}

