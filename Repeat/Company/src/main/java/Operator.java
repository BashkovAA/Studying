public class Operator extends CompanyEmployees implements Employee{

    public Operator(double salary) {
        this.salary = salary;
    }

    public void changePlaceWork() {
        System.out.println("Change your place work");
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }
}
