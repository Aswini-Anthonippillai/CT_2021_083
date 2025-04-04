package Q_06;
import java.util.Scanner;

public class Currentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year of birth
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Get the current year
        int currentYear = 2025; // You can replace this with `java.time.LocalDate.now().getYear()` for the current year dynamically

        // Calculate age
        int age = currentYear - birthYear;

        // Output the result
        System.out.println("You were born in " + birthYear + " and will be " + age + " this year.");

        scanner.close();
    }
}

