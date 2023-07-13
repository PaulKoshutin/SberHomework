public class BankOnline {
    private final String[] BLOCKED_CARDS = new String[]{"1111111111111111", "2222222222222222", "3333333333333333"};
    private final String[] WORKING_CARDS = new String[]{"4444444444444444", "5555555555555555", "6666666666666666"};

    public void send(String cardNumber, double money) throws BankOnlineException {
        try {
            if (cardNumber == null)
                throw new NullArgumentException();

            if (!cardNumber.matches("^[0-9]{16}$"))
                throw new InvalidCardNumberException();

            for (String card : BLOCKED_CARDS)
                if (cardNumber.equals(card))
                    throw new BlockedCardTransferException();

            if (money < 0)
                throw new NegativeTransferException();

            if (money > 50000)
                throw new OutOfLimitTransferException();

            boolean cardFound = false;
            for (String card : WORKING_CARDS)
                if (cardNumber.equals(card)) {
                    cardFound = true;
                    break;
                }
            if (!cardFound)
                throw new NoSuchCardException();

            if (money == 0)
                throw new PointlessTransferException();
        } catch (InvalidCardNumberException | BlockedCardTransferException | PointlessTransferException |
                 NoSuchCardException | NullArgumentException | OutOfLimitTransferException | NegativeTransferException e) {
            throw new BankOnlineException();
        }
    }
}
