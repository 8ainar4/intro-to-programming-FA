import java.util.Scanner;

public class CalorieTracker {
    private String firstName;
    private String lastName;
    private int age;
    private double weight; 
    private double height; 
    private String gender; 
    private String activityLevel;

    // Constructor
    public CalorieTracker(String firstName, String lastName, int age, double weight, double height, String gender, String activityLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.activityLevel = activityLevel;
    }

    // get and set methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel;
    }

    public double calculateBMR() {
        if (gender.equalsIgnoreCase("male")) {
            return 10 * weight + 6.25 * height - 5 * age + 5;
        } else {
            return 10 * weight + 6.25 * height - 5 * age - 161;
        }
    }

    public double calculateTDEE() {
        double bmr = calculateBMR();
        double pal = 1.2; //put the pal on sedentary as default
        
        if (activityLevel.equalsIgnoreCase("lightly active")) {
            pal = 1.375;
        } else if (activityLevel.equalsIgnoreCase("moderately active")) {
            pal = 1.55;
        } else if (activityLevel.equalsIgnoreCase("very active")) {
            pal = 1.725;
        } else if (activityLevel.equalsIgnoreCase("super active")) {
            pal = 1.9;
        }
        
        return bmr * pal;
    }

    public double calculateRemainingCalories(double consumedCalories) {
        return calculateTDEE() - consumedCalories;
    }

    public void displayUserInfo() {
        System.out.println("\nUser Information:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " cm");
        System.out.println("Gender: " + gender);
        System.out.println("Activity Level: " + activityLevel);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Calorie Tracker ===");
        
        // Get user input
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();
        
        System.out.print("Enter your age (years): ");
        int age = input.nextInt();
        
        System.out.print("Enter your weight (kg): ");
        double weight = input.nextDouble();
        
        System.out.print("Enter your height (cm): ");
        double height = input.nextDouble();
        
        input.nextLine();
        
        System.out.print("Enter your gender (male/female): ");
        String gender = input.nextLine();
        
        System.out.print("Enter your activity level (sedentary, lightly active, moderately active, very active, super active): ");
        String activityLevel = input.nextLine();
        
        CalorieTracker tracker = new CalorieTracker(firstName, lastName, age, weight, height, gender, activityLevel);
        
        tracker.displayUserInfo();
        System.out.printf("\nYour Basal Metabolic Rate (BMR) is: %.2f calories%n", tracker.calculateBMR());
        System.out.printf("Your Total Daily Energy Expenditure (TDEE) is: %.2f calories%n", tracker.calculateTDEE());
        

        System.out.print("\nEnter your daily calorie intake: ");
        double consumed = input.nextDouble();
        
        double remaining = tracker.calculateRemainingCalories(consumed);
        
        if (remaining > 0) {
            System.out.printf("You have %.2f calories remaining for today.%n", remaining);
        } else if (remaining < 0) {
            System.out.printf("You have exceeded your daily limit by %.2f calories.%n", -remaining);
        } else {
            System.out.println("You have consumed exactly your daily calorie limit.");
        }

    }
}
