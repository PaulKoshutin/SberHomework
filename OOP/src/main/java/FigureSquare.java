public class FigureSquare extends Figure implements Drawable {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void Draw() {
        System.out.println("Square " + getPoint().getX() + " " + getPoint().getY());
    }

    @Override
    public void Draw(Color color) {
        System.out.println(color + " Square " + getPoint().getX() + " " + getPoint().getY());
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
