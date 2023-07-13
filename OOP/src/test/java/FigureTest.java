import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FigureTest {
    @Test
    public void PhoneTester() {
        FigureCircle circle = new FigureCircle();

        circle.setPoint(new Point());
        circle.getPoint().setX(1);
        circle.getPoint().setY(1);
        circle.setRadius(10);

        circle.Draw();
        circle.Draw(Color.GREEN);
        assertEquals(circle.area(), 314, 0.5);
        assertEquals(circle.perimeter(), 62.8, 0.5);

        FigureUtil.draw(circle);
        FigureUtil.draw(circle, Color.BLUE);
        assertEquals(FigureUtil.area(circle), circle.area(), 0.5);
        assertEquals(FigureUtil.perimeter(circle), circle.perimeter(), 0.5);
    }
}
