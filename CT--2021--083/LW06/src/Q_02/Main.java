package Q_02;
import java.util.Scanner;

public class Main {
    public static int countDigits(int num) {
        if (num == 0) return 1;
        int count = 0;
        num = Math.abs(num);
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (n < 0) break;
            System.out.println("Digits: " + countDigits(n));
        }
        sc.close();
    }
}

