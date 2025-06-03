package Q_02;
import java.util.Scanner;

class Pet {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return "Pet";
    }
}

class Dog extends Pet {
    @Override
    public String getType() {
        return "Dog";
    }
}

class Cat extends Pet {
    @Override
    public String getType() {
        return "Cat";
    }
}

public class SimplePetArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pet[] pets = new Pet[100]; // array of pets
        int count = 0;

        while (true) {
            System.out.print("Enter pet name (or STOP to end): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.print("Enter pet type ('c' for cat, 'd' for dog): ");
            String type = scanner.nextLine();

            Pet pet;
            if (type.equalsIgnoreCase("c")) {
                pet = new Cat();
            } else if (type.equalsIgnoreCase("d")) {
                pet = new Dog();
            } else {
                System.out.println("Invalid type. Try again.");
                continue;
            }

            pet.setName(name);
            pets[count] = pet;
            count++;
        }

        System.out.println("\nList of Pets:");
        for (int i = 0; i < count; i++) {
            System.out.println(pets[i].getName() + " is a " + pets[i].getType());
        }

        scanner.close();
    }
}

