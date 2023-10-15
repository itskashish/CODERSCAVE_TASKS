import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();

        // Prompt the user for height in meters
        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();

        // Calculate BMI
        double bmi = calculateBMI(weight, height);

        // Display the result
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Interpret the BMI
        interpretBMI(bmi);

        input.close();
    }

    // Function to calculate BMI
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // Function to interpret BMI
    public static void interpretBMI(double bmi) {
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}
