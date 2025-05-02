import java.util.Scanner;

public class PlantWatering {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        double totalLiters = 0;
        double totalPlants = 0;
        double totalLitersPerPlantSum = 0;
        int count = 1;
        int i = 0;
        
        while (i != -1) {
            System.out.printf("session %d%n", count);
          
            System.out.print("number of plants: ");
            int plants = input.nextInt();
            totalPlants += plants;
          
            System.out.print("liters watered:  ");
            double liters = input.nextDouble();
            totalLiters += liters;
          
    
            double litersPerPlant = liters / plants;
            System.out.printf("liters per plant: %.2f%n", litersPerPlant);
            totalLitersPerPlantSum += litersPerPlant;
            count++;
          
            System.out.print("do you want to continue? (No = -1, Yes = 0)");
            i = input.nextInt();

            System.out.println("----------------------------");
        }
        
        double average = totalLiters / totalPlants;
        System.out.printf("average is: %.2f", average);

    }
}
