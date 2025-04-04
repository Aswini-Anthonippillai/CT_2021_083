package Q_04;
import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input body weight
        System.out.print("Enter your weight in pounds: ");
        double weight = scanner.nextDouble();

        // Calculate the number of calories needed
        double calories = weight * 19;

        // Display the result
        System.out.println("You need " + calories + " calories per day.");

        scanner.close();
    }
}

