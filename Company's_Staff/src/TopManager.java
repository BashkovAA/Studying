public class TopManager extends CompanyEmployees implements Employee{

    private static final int SALARY = 100_000;
    private static final double BONUS_PERCENT = 1.5D;
    private int companyIncome;
    private int addSalary;

    public TopManager(int companyIncome) {
        this.companyIncome = companyIncome;
    }

    @Override
    public int getMonthSalary() {
        addSalary = (companyIncome > 10_000_000)? (int) (SALARY * BONUS_PERCENT) : 0;
        int monthSalary = SALARY + addSalary;
        return monthSalary;
    }
}
