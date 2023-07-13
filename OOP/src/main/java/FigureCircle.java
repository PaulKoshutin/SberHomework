public class FigureCircle extends Figure implements Drawable {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void Draw() {
        System.out.println("Circle " + getPoint().getX() + " " + getPoint().getY());
    }

    @Override
    public void Draw(Color color) {
        System.out.println(color + " Circle " + getPoint().getX() + " " + getPoint().getY());
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * radius;
    }
}
