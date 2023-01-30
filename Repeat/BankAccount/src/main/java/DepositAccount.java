import java.time.LocalDate;
import java.util.Calendar;

public class DepositAccount extends BankAccount{
    public LocalDate lastIncome;

    @Override
    public void take(int amountTake) {
        if (LocalDate.now().minusMonths(1).isAfter(lastIncome)) {
            super.take(amountTake);
        }
    }

    @Override
    public void put(int amountPut) {
        super.put(amountPut);
        lastIncome = LocalDate.now();
    }
}
