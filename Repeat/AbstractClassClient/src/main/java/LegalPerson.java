public class LegalPerson extends Client{
    private final double COMMISSION = 0.1;

    @Override
    double take(double takeAmount) {
        super.take(takeAmount);
        if (takeAmount > 0) {
            amount -= takeAmount * COMMISSION;
        }
        return amount;
    }
}
