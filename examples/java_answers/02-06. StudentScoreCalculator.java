import java.util.Scanner;

public class StudentScoreCalculator {

    public double inputScores(int num) {
        System.out.print("Enter number of subjects for Student " + num + ": ");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter score for subject " + i + ": ");
            double score = input.nextDouble();
            sum += score;
        }
        return sum / count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentScoreCalculator student = new StudentScoreCalculator();

        for (int num = 1; num <= 3; num++) {
            System.out.printf("---- Student %d ----", num);
            double average = student.inputScores(num);
            System.out.printf("Average score for Student %d: %.2f%n", num, average);
            System.out.println("--------------------\n");
        }

    }
}
