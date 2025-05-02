import java.util.Scanner;

public class SalesGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the initial sales amount (in dollars): ");
        double initialSales = input.nextDouble();
        
        System.out.print("enter the growth rate (in percentage): ");
        double rate = input.nextDouble();
        
        double growthRate = rate / 100;

        double year1 = initialSales;
        double year2 = year1 * (1 + rate);
        double year3 = year2 * (1 + rate);
        
        double totalSales = year1 + year2 + year3;

        System.out.printf("sales for year 1: $%.2f%n", year1);
        System.out.printf("sales for year 2: $%.2f%n", year2);
        System.out.printf("sales for year 3: $%.2f%n", year3);
        System.out.printf("total sales: $%.1f%n", totalSales);
    }
}
