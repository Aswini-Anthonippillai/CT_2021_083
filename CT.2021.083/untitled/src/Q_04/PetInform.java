package Q_04;
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

public class PetInform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog[] dogs = new Dog[100];
        Cat[] cats = new Cat[100];
        int dogCount = 0, catCount = 0;

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
                cats[catCount++] = cat;
            } else if (type.equalsIgnoreCase("d")) {
                Dog dog = new Dog();
                dog.setName(name);
                System.out.print("Enter weight: ");
                double weight = scanner.nextDouble();
                scanner.nextLine(); // clear newline
                dog.setWeight(weight);
                dogs[dogCount++] = dog;
            } else {
                System.out.println("Invalid type. Try again.");
            }
        }

        System.out.println("\nCats:");
        for (int i = 0; i < catCount; i++) {
            System.out.println(cats[i].getName() + " - Coat Color: " + cats[i].getCoatColor());
        }

        System.out.println("\nDogs:");
        for (int i = 0; i < dogCount; i++) {
            System.out.println(dogs[i].getName() + " - Weight: " + dogs[i].getWeight() + " kg");
        }

        scanner.close();
    }
}

