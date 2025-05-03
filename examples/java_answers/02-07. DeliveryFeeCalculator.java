import java.util.Scanner;
public class DeliveryFeeCalculator{
  public void inputOrderDetails(int orderNumber){
    Scanner input = new Scanner(System.in);
    
    System.out.printf("Enter details for Order %d%n", orderNumber);

    int itemCount;
    System.out.print("Enter number of items: ");
    itemCount = input.nextInt();

    double distance;
    System.out.print("Enter distance in kilometers: ");
    distance = input.nextDouble();
    
    double deliveryFee = calculateDeliveryFee(distance);

    displayOrderDetails(orderNumber, itemCount, distance, deliveryFee);
  }

  public double calculateDeliveryFee(double distance){
    double deliveryFee;
    if (distance <= 5.0){
      deliveryFee = 10.0;
    }
    else {
      deliveryFee = 10.0 + (distance - 5.0)*2.0;
        }
    return deliveryFee;
  }

  public void displayOrderDetails(int orderNumber, int itemCount, double distance, double deliveryFee){
    System.out.printf("Order %d's delivery fee for %d items: %.2f%n", orderNumber, itemCount, deliveryFee);
    System.out.printf("----------------------------------------%n");
    
  }
    
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
    int num;
    System.out.print("Enter total number of orders: ");
    num = input.nextInt();

    for(int orderNumber = 1; orderNumber <= num; orderNumber++){
      DeliveryFeeCalculator cal = new DeliveryFeeCalculator();

      cal.inputOrderDetails(orderNumber);
    }
  }
  
}
