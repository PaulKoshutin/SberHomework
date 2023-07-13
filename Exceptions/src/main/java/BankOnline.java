public class BankOnline {
    private String[] blockedCards = new String[]{"1111111111111111", "2222222222222222", "3333333333333333"};
    private String[] workingCards = new String[]{"4444444444444444", "5555555555555555", "6666666666666666"};

    public void send(String cardNumber, double money) throws InvalidCardNumberException, BlockedCardTransferException, NegativeTransferException, OutOfLimitTransferException, NullArgumentException, NoSuchCardException, PointlessTransferException {
        try {
            if (cardNumber == null)
                throw new NullArgumentException();

            if (!cardNumber.matches("[0-9]+") || cardNumber.length() != 16)
                throw new InvalidCardNumberException();

            for (String card : blockedCards)
                if (cardNumber.equals(card))
                    throw new BlockedCardTransferException();

            if (money < 0)
                throw new NegativeTransferException();

            if (money > 50000)
                throw new OutOfLimitTransferException();

            boolean cardFound = false;
            for (String card : workingCards)
                if (cardNumber.equals(card)) {
                    cardFound = true;
                    break;
                }
            if (!cardFound)
                throw new NoSuchCardException();

            if (money == 0)
                throw new PointlessTransferException();
        } catch (InvalidCardNumberException e) {
            throw new InvalidCardNumberException();
        } catch (BlockedCardTransferException e) {
            throw new BlockedCardTransferException();
        } catch (NegativeTransferException e) {
            throw new NegativeTransferException();
        } catch (OutOfLimitTransferException e) {
            throw new OutOfLimitTransferException();
        } catch (NullArgumentException e) {
            throw new NullArgumentException();
        } catch (NoSuchCardException e) {
            throw new NoSuchCardException();
        } catch (PointlessTransferException e) {
            throw new PointlessTransferException();
        }
    }
}
