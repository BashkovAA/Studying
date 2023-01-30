public abstract class CompanyEmployees implements Employee, Comparable {
    protected int salary;

    public CompanyEmployees() {

    }

    @Override
    public int compareTo(Object o) {
        CompanyEmployees employees = (CompanyEmployees) o;
        return Integer.compare(this.getMonthSalary(), employees.getMonthSalary());
    }

    @Override
    public String toString() {
        return getClass().getName() + " with salary: " + getMonthSalary();
    }
}
