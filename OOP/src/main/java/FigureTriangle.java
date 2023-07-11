import static java.lang.Math.sqrt;

public class FigureTriangle extends Figure implements Drawable {
    private double a, b, c;

    @Override
    public void Draw() {
        System.out.println("Triangle " + getPoint().getX() + " " + getPoint().getY());
    }

    @Override
    public void Draw(Color color) {
        System.out.println(color + " STriangle " + getPoint().getX() + " " + getPoint().getY());
    }

    @Override
    public double area() {
        return sqrt(perimeter() / 2 * (perimeter() / 2 - a) * (perimeter() / 2 - b) * (perimeter() / 2 - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
