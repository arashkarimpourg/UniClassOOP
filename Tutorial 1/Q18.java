import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (5.0 / 9.0) * (fahrenheit - 32.0);
        System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius.", fahrenheit, celsius);
    }
}

