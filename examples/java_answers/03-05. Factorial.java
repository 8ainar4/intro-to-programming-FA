public class Factorial {

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.printf("%10s -> %20s%n", "n", "n!");
        System.out.println("----------------------------------");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%10d -> %20d%n", i, factorial(i));

        }
    }
}
