public class BankAccount {
    protected int amount = 0;

    public int getAmount() {
        return amount;
    }

    public void put(int amountPut) {
        if (amountPut > 0) {
            amount += amountPut;
        }
    }

    public void take(int amountTake) {
        if (amount >= amountTake) {
            amount -=amountTake;
        }
    }
}
