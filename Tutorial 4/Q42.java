import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        System.out.print("The reversal is: ");
        reverse(n);
    }

    public static void reverse(int number) {
        while (number > 0) {
            System.out.print(number % 10);
            number /= 10;
        }
        System.out.println();
    }
}
