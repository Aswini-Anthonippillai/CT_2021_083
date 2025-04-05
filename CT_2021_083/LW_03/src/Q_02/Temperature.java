package Q_02;

public class Temperature {
    private double celsius;

    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }

    public double getCelsius() {
        return this.celsius;
    }
}
