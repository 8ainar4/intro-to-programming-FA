import java.util.Scanner;
public class SimpleCalculator {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //تعریف اولین عدد و گرفتن ورودی
    int a;
    System.out.print("enter your first number: ");
    a = input.nextInt();

    //تعریف عدد دوم و گرفتن ورودی
    int b;
    System.out.print("enter your second number: ");
    b = input.nextInt();
    
    //تعریف چهار عمل ریاضی خواسته شده
    int sum = a + b;
    int difference = a - b;
    int multiple = a * b;
    double division = (double) a / b;

    System.out.printf("sum: %d%ndifference: %d%nmultiplication: %d%ndivision: %.2f%n", sum, difference, multiple, division);
    
  }
}
