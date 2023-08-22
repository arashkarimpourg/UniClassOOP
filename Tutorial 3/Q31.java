public class Q31 {
    public static void main(String[] args) {
        System.out.println("| Kilograms | Pounds |");
        System.out.println("| --- | --- |");
        for (int i = 1; i <= 199; i += 2) {
            double pounds = i * 2.2;
            System.out.printf("| %d | %.1f |\n", i, pounds);
        }
    }
}

