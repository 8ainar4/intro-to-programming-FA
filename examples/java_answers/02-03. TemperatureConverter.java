public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    //fahrenheitToCelsius method isn't used. just needed for learning process
    public static void displayConversions() {
    	for (int c = 0; c <= 100; c += 10) {
            double f = celsiusToFahrenheit(c);
            System.out.printf("%d degrees Celsius is %.1f degrees Fahrenheit%n", c, f);
            System.out.printf("%.1f degrees Fahrenheit is %d degrees Celsius%n", f, c);
            System.out.println("----------------------------------------------");
        }
    }


    public static void main(String[] args) {
        displayConversions();
    }
}
