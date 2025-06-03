package Q_03;
import java.util.Scanner;

public class Petgroup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] catNames = new String[100];
        String[] dogNames = new String[100];
        int catCount = 0;
        int dogCount = 0;

        while (true) {
            System.out.print("Enter pet name (or STOP to end): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.print("Enter pet type ('c' for cat, 'd' for dog): ");
            String type = scanner.nextLine();

            if (type.equalsIgnoreCase("c")) {
                catNames[catCount] = name;
                catCount++;
            } else if (type.equalsIgnoreCase("d")) {
                dogNames[dogCount] = name;
                dogCount++;
            } else {
                System.out.println("Invalid type. Try again.");
            }
        }

        System.out.println("\nCats:");
        for (int i = 0; i < catCount; i++) {
            System.out.println(catNames[i]);
        }

        System.out.println("\nDogs:");
        for (int i = 0; i < dogCount; i++) {
            System.out.println(dogNames[i]);
        }

        scanner.close();
    }
}

