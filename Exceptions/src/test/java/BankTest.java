import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class BankTest {
    @Test
    public void BankTester() throws InvalidCardNumberException, NoSuchCardException, BlockedCardTransferException, PointlessTransferException, NullArgumentException, NegativeTransferException, OutOfLimitTransferException {
        BankOnline bank = new BankOnline();
        InvalidCardNumberException e1 = assertThrows(
                InvalidCardNumberException.class,
                () -> bank.send("abc",1) );
        BlockedCardTransferException e2 = assertThrows(
                BlockedCardTransferException.class,
                () -> bank.send("1111111111111111",1) );
        NegativeTransferException e3 = assertThrows(
                NegativeTransferException.class,
                () -> bank.send("4444444444444444",-1) );
        OutOfLimitTransferException e4 = assertThrows(
                OutOfLimitTransferException.class,
                () -> bank.send("4444444444444444",50001) );
        NullArgumentException e5 = assertThrows(
                NullArgumentException.class,
                () -> bank.send(null,50000) );
        NoSuchCardException e6 = assertThrows(
                NoSuchCardException.class,
                () -> bank.send("0000000000000000",50000) );
        PointlessTransferException e7 = assertThrows(
                PointlessTransferException.class,
                () -> bank.send("4444444444444444",0) );
    }
}
