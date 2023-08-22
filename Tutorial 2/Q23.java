import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is " + num1 + " + " + num2 + "? ");
        int answer = scanner.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + answer + " is " + (num1 + num2 == answer));
    }
}

