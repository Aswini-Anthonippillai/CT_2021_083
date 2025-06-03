package Q_05;
import java.util.Scanner;

class Pet {
    String name;
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
}

class Dog extends Pet {
    double weight;
    public void setWeight(double weight) { this.weight = weight; }
    public double getWeight() { return weight; }
}

class Cat extends Pet {
    String coatColor;
    public void setCoatColor(String coatColor) { this.coatColor = coatColor; }
    public String getCoatColor() { return coatColor; }
}

public class Dogweight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pet[] pets = new Pet[100];
        int petCount = 0;

        while (true) {
            System.out.print("Enter pet name (or STOP to end): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("STOP")) break;

            System.out.print("Enter pet type ('c' for cat, 'd' for dog): ");
            String type = scanner.nextLine();

            if (type.equalsIgnoreCase("c")) {
                Cat cat = new Cat();
                cat.setName(name);
                System.out.print("Enter coat color: ");
                String color = scanner.nextLine();
                cat.setCoatColor(color);
                pets[petCount++] = cat;
            } else if (type.equalsIgnoreCase("d")) {
                Dog dog = new Dog();
                dog.setName(name);
                System.out.print("Enter weight: ");
                double weight = scanner.nextDouble();
                scanner.nextLine(); // consume newline
                dog.setWeight(weight);
                pets[petCount++] = dog;
            } else {
                System.out.println("Invalid type. Try again.");
            }
        }

        // Create Dog-only array
        Dog[] dogs = new Dog[petCount];
        int dogCount = 0;
        for (int i = 0; i < petCount; i++) {
            if (pets[i] instanceof Dog) {
                dogs[dogCount++] = (Dog) pets[i];
            }
        }

        // Compute average, min, and max weight of dogs
        if (dogCount > 0) {
            double sum = 0;
            double min = dogs[0].getWeight();
            double max = dogs[0].getWeight();

            for (int i = 0; i < dogCount; i++) {
                double w = dogs[i].getWeight();
                sum += w;
                if (w < min) min = w;
                if (w > max) max = w;
            }

            double avg = sum / dogCount;

            System.out.println("\nDog Weight Statistics:");
            System.out.println("Average weight: " + avg + " kg");
            System.out.println("Minimum weight: " + min + " kg");
            System.out.println("Maximum weight: " + max + " kg");
        } else {
            System.out.println("\nNo dogs entered.");
        }

        scanner.close();
    }
}

