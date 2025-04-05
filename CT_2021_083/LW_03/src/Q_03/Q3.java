package Q_03;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the inner radius of the circle:");
        double innerRadius=input.nextDouble();
        System.out.println("Enter the outer radius of the circle:");
        double outerRadius=input.nextDouble();

        if(innerRadius>outerRadius) {
            System.out.println("Inner radius connot be greater than outer radius. ");

        }
        else {
            Circle outerCircle=new Circle(outerRadius);
            Circle innerCircle=new Circle(innerRadius);

            double Area=outerCircle.computeArea()-innerCircle.computeArea();
            System.out.println("The area is: "+Area);
        }
    }
}


