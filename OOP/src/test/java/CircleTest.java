import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {
    @Test
    public void CircleTester() {
        Circle testCircle = new Circle(5.5, "red");
        assertEquals(testCircle.toString(), "5.5 red 94.985 34.54");
    }
}
