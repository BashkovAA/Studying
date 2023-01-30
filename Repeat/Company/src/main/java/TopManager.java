import java.util.Random;

public class TopManager extends CompanyEmployees implements Employee{
    private static final double BONUS = 1.5;

    public TopManager(double salary, double companyIncome) {
        if (companyIncome > 10_000_000) {
            this.salary = salary + salary * BONUS;
        } else {
            this.salary = salary;
        }
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }
}
