import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter another integer: ");
        int b = scanner.nextInt();
        System.out.print("Enter a third integer: ");
        int c = scanner.nextInt();
        System.out.print("The smallest integer is: ");
        System.out.print(findSmallest(a, b, c));
    }
    public static int findSmallest(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
