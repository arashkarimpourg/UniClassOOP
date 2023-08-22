import java.util.Scanner;

public class Q41 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = scanner.nextLong();
        System.out.println("The sum of the digits is: " + sumDigits(n));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
