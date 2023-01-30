public abstract class CompanyEmployees implements Employee, Comparable{
    protected double salary;

    @Override
    public int compareTo(Object o) {
        CompanyEmployees employee = (CompanyEmployees) o;
        return Double.compare(this.getMonthSalary(), employee.getMonthSalary());
    }

    @Override
    public String toString() {
        return getClass().getName() + " with month salary: " + getMonthSalary();
    }
}
