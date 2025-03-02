package Q_11;
import java.util.*;

public class Question_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the full name (first middle last) with spaces :");
        String text = scanner.nextLine();
        System.out.println(text);

        String[] parts = text.split(" ");
        String fname = parts[0];
        String mname = parts[1];
        String lname = parts[2];

        System.out.println(lname+","+" "+fname+" "+mname.charAt(0)+".");

    }
}

