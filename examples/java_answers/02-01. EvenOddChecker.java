import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter a num: ");
        int num = input.nextInt();
        
        int count = 1;
        while (count <= num) {
            if (count % 2 == 0) {
                System.out.println(count + " is Even.");
            } else {
                System.out.println(count + " is Odd.");
            }
            count++;
        }
    }
}
