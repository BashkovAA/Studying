import java.util.Random;

public class Manager extends CompanyEmployees implements Employee{

    private static final int SALARY = 100_000;
    private static final double BONUS_PERCENT = 0.05D;
    private final double earningsForCompany;


    public Manager() {
        this.earningsForCompany = (Math.random() * (140_000 - 115_000) + 115_000) * BONUS_PERCENT;
    }


    @Override
    public int getMonthSalary() {
        int monthSalary = SALARY + (int) Math.round(earningsForCompany);
        return monthSalary;
    }
}
