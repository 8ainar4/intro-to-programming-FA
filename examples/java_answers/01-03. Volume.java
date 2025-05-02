import java.util.Scanner;
public class LargestNum {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    double radius;
    System.out.print("enter radius (in meter): ");
    radius = input.nextDouble();

    double height;
    System.out.print("enter the height (in meter): ");
    height = input.nextDouble();
    
    double PI = 3.14;
    
    double volume = (double) (1.0/3.0)*(PI)*(radius*radius)*height;
    System.out.printf("volume is: %.2f", volume);


    //or you could use Math.PI for pi:
    //double volume = (double) (1.0/3.0)*(Math.PI)*(radius*radius)*height;
  }
}
