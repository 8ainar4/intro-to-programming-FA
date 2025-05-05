import java.util.Scanner;
public class DataUsage{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of customers: ");
        int count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("\nCustomer " + i + ":");
            
            System.out.print("ID: ");
            String ID = input.next();

            System.out.print("Beginning data (MB): ");
            int beginningData = input.nextInt();

            System.out.print("Total data used (MB): ");
            int dataUsed = input.nextInt();

            System.out.print("Total data added (MB): ");
            int dataAdded = input.nextInt();

            System.out.print("Data limit (MB): ");
            int dataLimit = input.nextInt();

            int newData = beginningData + dataUsed - dataAdded;

            System.out.println("New data (MB): " + newData);
            if (newData > dataLimit) {
                System.out.println("Data limit exceeded");
            }

        }
    }
}
