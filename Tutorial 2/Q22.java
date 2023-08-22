import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your BMI is " + bmi);
        if (bmi < 16) {
            System.out.println("You are seriously underweight.");
        } else if (bmi < 18) {
            System.out.println("You are underweight.");
        } else if (bmi < 24) {
            System.out.println("You have a normal weight.");
        } else if (bmi < 29) {
            System.out.println("You are overweight.");
        } else if (bmi < 35) {
            System.out.println("You are seriously overweight.");
        } else {
            System.out.println("You are gravely overweight.");
        }
    }
}
