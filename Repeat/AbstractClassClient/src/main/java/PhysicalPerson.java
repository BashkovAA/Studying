public class PhysicalPerson extends Client{
    private final double COMMISSION_UNDER_1000 = 0.1;
    private final double COMMISSION_ABOVE_1000 = 0.05;

    @Override
    double put(double putAmount) {
        super.put(putAmount);
        if (putAmount < 1000 && putAmount > 0) {
            amount -= putAmount * COMMISSION_UNDER_1000;
        } else if (putAmount > 0){
            amount -= putAmount * COMMISSION_ABOVE_1000;
        }
        return amount;
    }
}
