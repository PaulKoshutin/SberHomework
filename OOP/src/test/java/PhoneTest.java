import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneTest {
    @Test
    public void PhoneTester() {
        Phone testPhone1 = new Phone("123", "Paul&Co", 12.5f);
        Phone testPhone2 = new Phone("1234", "Paul&Company");
        Phone testPhone3 = new Phone();

        assertEquals(testPhone1.getNumber(), "123");
        assertEquals(testPhone2.getNumber(), "1234");
        assertEquals(testPhone3.getNumber(), null);

        testPhone1.receiveCall("Bob");
        testPhone1.receiveCall("Bob", "321");
        testPhone1.sendMessage(new String[]{"231", "345", "987"});

        assertEquals(testPhone1.toString(), "123 Paul&Co 12.5");
    }
}
