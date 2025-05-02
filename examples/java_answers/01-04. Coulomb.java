import java.util.Scanner;

public class Coulomb {
    public static void main(String[] args) {
      
        //final is for constant variables
        final double k = 9e9;
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter Q1: ");
        double q1 = input.nextDouble();
        
        System.out.print("enter Q2: ");
        double q2 = input.nextDouble();
        
        System.out.print("enter the distance between Q1 , Q2: ");
        double r = input.nextDouble();
        
        double force = k * q1 * q2 / (r * r);
        System.out.printf("the force between Q1 and Q2 is: %.2f", force);
        
    }
}
