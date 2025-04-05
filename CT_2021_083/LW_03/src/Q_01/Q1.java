package Q_01;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter temperature in celsius");
        double celsiusInput=input.nextDouble();
        Temperature temperature=new Temperature(celsiusInput);
        System.out.println("Equivalent temperature in fahrenheit:"+temperature.toFahrenheit());
        System.out.println("Enter temperature in F to convert back to c");
        double  fahrenheitInput=input.nextDouble();
        temperature.setFahrenheit(fahrenheitInput);
        System.out.println("convert back to c:"+temperature.toCelsius());
        input.close();
    }
}
