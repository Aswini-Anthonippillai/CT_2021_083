package Q_02;

    import java.util.Scanner;

    public class Q2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble();

            Temperature temp = new Temperature();
            temp.setFahrenheit(fahrenheit);

            System.out.println("Equivalent temperature in Celsius: " + temp.getCelsius());

            input.close();
        }

    }






