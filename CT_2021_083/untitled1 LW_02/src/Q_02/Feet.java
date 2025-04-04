package Q_02;
public class Feet {
    public static void main(String[] args) {
        double cm = 170; // Example input in centimeters

        double inches = cm / 2.54;
        int feet = (int) (inches / 12);
        double remainingInches = inches % 12;

        System.out.println(cm + " cm is " + feet + " feet and " + remainingInches + " inches.");
    }
}

