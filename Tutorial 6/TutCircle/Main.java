class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        double area = circle1.getArea();
        double circumference = circle1.getCircumference();
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
