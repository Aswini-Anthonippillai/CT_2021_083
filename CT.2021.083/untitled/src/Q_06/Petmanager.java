package Q_06;
import java.util.Scanner;

class Pet {
    String name;
    public Pet(String name) { this.name = name; }
    public String getName() { return name; }
}

class Dog extends Pet {
    double weight;
    public Dog(String name, double weight) {
        super(name);
        this.weight = weight;
    }
    public double getWeight() { return weight; }
}

class Cat extends Pet {
    String coatColor;
    public Cat(String name, String coatColor) {
        super(name);
        this.coatColor = coatColor;
    }
    public String getCoatColor() { return coatColor; }
}

public class Petmanager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog[] dogs = new Dog[10];
        Cat[] cats = new Cat[10];
        int dogCount = 0, catCount = 0;

        int choice;
        do {
            System.out.println("\nMenu: 1-Add Cat, 2-Add Dog, 3-Remove Cat, 4-Remove Dog, 0-Quit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: // Add Cat
                    System.out.print("Cat name: ");
                    String cname = sc.nextLine();
                    System.out.print("Coat color: ");
                    String color = sc.nextLine();
                    cats[catCount++] = new Cat(cname, color);
                    System.out.println("Added cat: " + cname);
                    break;

                case 2: // Add Dog
                    System.out.print("Dog name: ");
                    String dname = sc.nextLine();
                    System.out.print("Weight: ");
                    double weight = sc.nextDouble();
                    sc.nextLine();
                    dogs[dogCount++] = new Dog(dname, weight);
                    System.out.println("Added dog: " + dname);
                    break;

                case 3: // Remove Cat
                    System.out.print("Remove cat name: ");
                    String rcat = sc.nextLine();
                    boolean foundCat = false;
                    for (int i = 0; i < catCount; i++) {
                        if (cats[i].getName().equalsIgnoreCase(rcat)) {
                            cats[i] = cats[catCount - 1];
                            cats[--catCount] = null;
                            foundCat = true;
                            System.out.println("Removed cat: " + rcat);
                            break;
                        }
                    }
                    if (!foundCat) System.out.println("Cat not found.");
                    break;

                case 4: // Remove Dog
                    System.out.print("Remove dog name: ");
                    String rdog = sc.nextLine();
                    boolean foundDog = false;
                    for (int i = 0; i < dogCount; i++) {
                        if (dogs[i].getName().equalsIgnoreCase(rdog)) {
                            dogs[i] = dogs[dogCount - 1];
                            dogs[--dogCount] = null;
                            foundDog = true;
                            System.out.println("Removed dog: " + rdog);
                            break;
                        }
                    }
                    if (!foundDog) System.out.println("Dog not found.");
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            // Show current pets
            System.out.println("\nCurrent Cats:");
            for (int i = 0; i < catCount; i++) {
                System.out.println("- " + cats[i].getName() + ", Color: " + cats[i].getCoatColor());
            }
            System.out.println("Current Dogs:");
            for (int i = 0; i < dogCount; i++) {
                System.out.println("- " + dogs[i].getName() + ", Weight: " + dogs[i].getWeight() + "kg");
            }

        } while (choice != 0);

        sc.close();
    }
}

