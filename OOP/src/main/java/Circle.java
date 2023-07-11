public class Circle {
    private double radius;
    private String color;

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public double perimeter() {
        return 2 * 3.14 * radius;
    }

    public String toString() {
        String str = radius + " " + color + " " + area() + " " + perimeter();
        System.out.println(str);
        return str;
    }
}
