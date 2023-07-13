public class FigureRectangle extends Figure implements Drawable {
    private double a, b;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public void Draw() {
        System.out.println("Rectangle " + getPoint().getX() + " " + getPoint().getY());
    }

    @Override
    public void Draw(Color color) {
        System.out.println(color + " Rectangle " + getPoint().getX() + " " + getPoint().getY());
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }
}
