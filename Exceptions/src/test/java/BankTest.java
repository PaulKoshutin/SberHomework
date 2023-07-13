import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class BankTest {
    @Test
    public void BankTester(){
        BankOnline bank = new BankOnline();
        assertThrows(
                BankOnlineException.class,
                () -> bank.send("abc", 1));
        assertThrows(
                BankOnlineException.class,
                () -> bank.send("1111111111111111", 1));
        assertThrows(
                BankOnlineException.class,
                () -> bank.send("4444444444444444", -1));
        assertThrows(
                BankOnlineException.class,
                () -> bank.send("4444444444444444", 50001));
        assertThrows(
                BankOnlineException.class,
                () -> bank.send(null, 50000));
        assertThrows(
                BankOnlineException.class,
                () -> bank.send("0000000000000000", 50000));
        assertThrows(
                BankOnlineException.class,
                () -> bank.send("4444444444444444", 0));
    }
}
