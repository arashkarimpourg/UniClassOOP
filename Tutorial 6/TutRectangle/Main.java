public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.width = 2;
        rect.height = 3;

        System.out.println("Area of Rectangle: " + rect.getArea());
        System.out.println("Perimeter of Rectangle: " + rect.getPerimeter());
    }
}
