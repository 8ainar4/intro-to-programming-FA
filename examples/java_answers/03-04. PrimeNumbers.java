import java.util.Scanner;

public class PrimeNumbers {
  
    public static int isPrime(int num) {
        if (num < 2) {
            return 0; 
        }

        //یکی از راه های پیدا کردن اعداد اول چک کردن بخش پذیری بر اعداد قبل آن تا جذر خود عدد می‌باشد.
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void printPrimes(int n) {
        System.out.printf("prime numbers till %d: %n%n", n);
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) == 1) {
                System.out.printf("%d\t", i);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = input.nextInt();

        printPrimes(num);
    }
}
