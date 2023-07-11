import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PizzaTest {
    @Test
    public void BookTester() {
        PizzaOrder order = new PizzaOrder("Pizza", "Pizarro, 94", "BIG", true);

        order.order();
        order.order();

        assertEquals(order.toString(), "Pizza Pizarro, 94 BIG true true");

        assertEquals(order.getName(), "Pizza");
        assertEquals(order.getAddress(), "Pizarro, 94");
        assertEquals(order.getSauceNeeded(), true);
    }
}
