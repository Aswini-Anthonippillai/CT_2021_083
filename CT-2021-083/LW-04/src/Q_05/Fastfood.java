package Q_05;
import java.util.Scanner;

public class Fastfood {

    public static void main(String[] args) {

        String[] entrees = {"Tofu Burger", "Cajun Chicken", "Buffalo Wings", "Rainbow Fillet"};
        double[] entreePrices = {3.49, 4.59, 3.99, 2.99};

        String[] sideDishes = {"Rice Cracker", "No-Salt Fries", "Zucchini", "Brown Rice"};
        double[] sideDishPrices = {0.79, 0.69, 1.09, 0.59};

        String[] drinks = {"Cafe Mocha", "Cafe Latte", "Espresso", "Oolong Tea"};
        double[] drinkPrices = {1.99, 1.90, 2.49, 0.99};


        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to MyJava Lo-Fat Burgers! Here is our menu:");


        int entreeChoice = getValidChoice(scanner, entrees, "entree");


        int sideDishChoice = getValidChoice(scanner, sideDishes, "side dish");

        int drinkChoice = getValidChoice(scanner, drinks, "drink");


        double totalPrice = entreePrices[entreeChoice] + sideDishPrices[sideDishChoice] + drinkPrices[drinkChoice];


        System.out.println("\nYour Order:");
        System.out.println("Entree: " + entrees[entreeChoice] + " - $" + entreePrices[entreeChoice]);
        System.out.println("Side Dish: " + sideDishes[sideDishChoice] + " - $" + sideDishPrices[sideDishChoice]);
        System.out.println("Drink: " + drinks[drinkChoice] + " - $" + drinkPrices[drinkChoice]);


        System.out.printf("\nTotal Price: $%.2f\n", totalPrice);


        scanner.close();
    }


    private static int getValidChoice(Scanner scanner, String[] items, String category) {
        int choice;
        while (true) {
            System.out.println("\n" + category + " options:");
            for (int i = 0; i < items.length; i++) {
                System.out.println((i + 1) + ". " + items[i]);
            }
            System.out.print("Please choose a " + category + " by entering the number (1-" + items.length + "): ");
            choice = scanner.nextInt() - 1;
            if (choice >= 0 && choice < items.length) {
                break;
            } else {
                System.out.println("Invalid choice! Please enter a number between 1 and " + items.length + ".");
            }
        }
        return choice;
    }
}

