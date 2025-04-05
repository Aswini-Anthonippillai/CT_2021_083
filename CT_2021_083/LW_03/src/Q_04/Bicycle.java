package Q_04;

public class Bicycle {
    private String brand;
    private int gearCount;
    private Owner owner; // Owner object instead of separate name and phoneNo

    // Constructor
    public Bicycle(String brand, int gearCount, Owner owner) {
        this.brand = brand;
        this.gearCount = gearCount;
        this.owner = owner;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public int getGearCount() {
        return gearCount;
    }

    public Owner getOwner() {
        return owner;
    }

    // Display bicycle details
    public void displayDetails() {
        System.out.println("Bicycle Brand: " + brand);
        System.out.println("Gear Count: " + gearCount);
        System.out.println(owner);
    }
}



