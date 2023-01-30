public class CardAccount extends BankAccount{
    private static final double COMISSION = 0.1;

    @Override
    public void put(int amountPut) {
        super.put(amountPut);
    }

    @Override
    public void take(int amountTake) {
        super.take(amountTake);
        amount -= amountTake * COMISSION;
    }
}
