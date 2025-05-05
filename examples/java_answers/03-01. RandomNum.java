import java.security.SecureRandom;

public class RandomNum {
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();

        int num1 = rand.nextInt(100) + 1; 
        int num2 = rand.nextInt(100) + 1; 

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        System.out.println("Sum: " + sum(num1, num2));
        System.out.println("Product: " + multiply(num1, num2));
        System.out.println("Difference: " + difference(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int difference(int a, int b) {
        return a - b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
