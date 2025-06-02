package Q_06;
import java.util.Scanner;
import java.util.Random;

public class Sixth {
    public static void main(String[] args) {
        int number = new Random().nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess;

        System.out.println("Guess the number (1 to 100):");

        while (true) {
            guess = sc.nextInt();

            if (guess == number) {
                System.out.println("You guessed it!");
                break;
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        sc.close();
    }
}

