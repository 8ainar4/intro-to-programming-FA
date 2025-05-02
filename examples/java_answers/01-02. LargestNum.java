import java.util.Scanner;
public class LargestNum {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int num1;
    System.out.print("enter your first number: ");
    num1 = input.nextInt();

    int num2;
    System.out.print("enter your second number: ");
    num2 = input.nextInt();
    
    int num3;
    System.out.print("enter your third number: ");
    num3 = input.nextInt();

    int largest = num1;
    
    if (largest < num2) {
      largest = num2;
    }
    if (largest < num3){
      largest = num3;
    }
    
    System.out.println("largest num is: " + largest);
  }
}
