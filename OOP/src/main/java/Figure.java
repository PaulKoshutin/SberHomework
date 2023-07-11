abstract public class Figure {
    private Point point;

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    abstract public double area();

    abstract public double perimeter();
}
