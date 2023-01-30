public class Operator extends CompanyEmployees implements Employee {
    private static final int SALARY = 100_000;

    public Operator() {
    }

    @Override
    public int getMonthSalary() {
        return SALARY;
    }
}
