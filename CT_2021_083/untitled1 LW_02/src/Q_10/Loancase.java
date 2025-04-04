package Q_10;
import java.util.Scanner;

public class Loancase {
    public static void main(String[] args) {
        final int MONTHS_IN_YEAR = 12; // Constant for the number of months in a year

        Scanner scanner = new Scanner(System.in);

        // Input loan amount, annual interest rate, and loan period
        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter loan period in years: ");
        int loanPeriod = scanner.nextInt();

        // Calculate the monthly interest rate
        double monthlyInterestRate = annualInterestRate / 100.0 / MONTHS_IN_YEAR;

        // Calculate the number of payments (months)
        int numberOfPayments = loanPeriod * MONTHS_IN_YEAR;

        // Calculate the monthly payment
        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfPayments));

        // Calculate the total payment
        double totalPayment = monthlyPayment * numberOfPayments;

        // Output the result
        System.out.println("Monthly Payment: " + String.format("%.2f", monthlyPayment));
        System.out.println("Total Payment: " + String.format("%.2f", totalPayment));

        scanner.close();
    }
}

