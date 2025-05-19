package Q_01;
import java.util.Scanner;

public class Simplenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three integers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        int smallest = a;

        if (b < smallest) {
            smallest = b;
        }

        if (c < smallest) {
            smallest = c;
        }

        System.out.println("The smallest number is: " + smallest);
    }
}

