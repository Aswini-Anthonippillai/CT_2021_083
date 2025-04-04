package Q_09;
import java.util.Scanner;

public class Invest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal, interest rate, and number of years
        System.out.print("Enter the principal amount (P): ");
        double P = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (R) in percentage: ");
        double R = scanner.nextDouble();

        System.out.print("Enter the number of years (N): ");
        int N = scanner.nextInt();

        // Calculate the total amount after N years using the compound interest formula
        double amount = P * Math.pow((1 + (R / 100)), N);

        // Calculate the money earned (difference between total amount and principal)
        double moneyEarned = amount - P;

        // Output the result
        System.out.println("The money earned after " + N + " years is: " + moneyEarned);

        scanner.close();
    }
}

