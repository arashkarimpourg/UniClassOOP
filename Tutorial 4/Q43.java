import java.util.Scanner;

public class Q43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        System.out.println(n + (isPalindrome(n) ? " is " : " is not ") + "a palindrome.");
    }

    public static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        return result;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}

