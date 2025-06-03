package Q_01;
// Main.java
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Buddy");
        System.out.println(dog.getName() + " says: " + dog.speak());

        Cat cat = new Cat();
        cat.setName("Whiskers");
        System.out.println(cat.getName() + " says: " + cat.speak());
    }
}

