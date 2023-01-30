import java.util.Random;

public class Manager extends CompanyEmployees implements Employee{
    private static final double BONUS = 0.05;

    public Manager(double salary) {
        int bonus = new Random().nextInt(115_000, 140_000);
        this.salary = salary + bonus;
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }
}
