import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        boolean[] seats = new boolean[50]; // false means available
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Select section:\n1. VIP (Seats 1-20)\n2. Regular (Seats 21-50)");
            int choice = input.nextInt();

            //if choice 1 means VIP and else Regular
            String section = (choice == 1) ? "VIP" : "Regular";
          
            //as if choice is 1 the start and end point for VIP is [0, 19] and else regular is [20, 49]
            int start = (choice == 1) ? 0 : 20;
            int end = (choice == 1) ? 19 : 49;

            int seatIndex = findSeat(seats, start, end);
            
            if (seatIndex == -1) {
                String altSection = (choice == 1) ? "Regular" : "VIP";
                int altStart = (choice == 1) ? 20 : 0;
                int altEnd = (choice == 1) ? 49 : 19;
                
                System.out.println(section + " section is full. Try " + altSection + "? (1=Yes/0=No)");
                if (input.nextInt() == 1) {
                    seatIndex = findSeat(seats, altStart, altEnd);
                    if (seatIndex == -1) {
                        System.out.println("All seats booked. Next show in 3 hours.");
                        break;
                    }
                    section = altSection;
                } else {
                    System.out.println("Next show in 3 hours.");
                    break;
                }
            }
            
            seats[seatIndex] = true;
            printTicket(seatIndex + 1, section);
            
            System.out.println("Continue? (Yes = 1/No = 0)");
            if (input.nextInt() == 0) 
              break;
        }
    }

    private static int findSeat(boolean[] seats, int start, int end) {
        for (int i = start; i <= end; i++){
            if (!seats[i]) {
              return i;}
        return -1;
        }
    }

    private static void printTicket(int seatNum, String section) {
        System.out.println("------------------------------\n" +
                           "Cinema Entry Ticket\n" +
                           "Seat Number: " + seatNum + "\n" +
                           "Section: " + section + "\n" +
                           "------------------------------");
    }
}
