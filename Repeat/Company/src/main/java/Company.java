import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Company{
    private List<Employee> employees = new ArrayList<>();
    private final double income;
    private final String name;

    public Company(String name, double income) {
        this.name = name;
        this.income = income;
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }
    public void hireAll(Collection employees) {
        this.employees.addAll(employees);
    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }

    public double getIncome() {
        return income;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        sort(count);
//        Collections.reverse(employees);
        List<Employee> topSalary = new ArrayList<>();
        for (int i = employees.size() - count; i < employees.size(); i++) {
            topSalary.add(employees.get(i));
        }
        return topSalary;
    }
    public List<Employee> getLowestSalaryStaff(int count) {
        sort(count);
        List<Employee> lowestSalary = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            lowestSalary.add(employees.get(i));
        }
        return lowestSalary;
    }

    public void sort(int count) {
        if (count < 0 || count > employees.size()) {
            count = employees.size();
        }
        Collections.sort(employees);
    }

    public int getCountEmployees() {
        return employees.size();
    }

    public List<Employee> getCompanyStaff() {
        return employees;
    }

    @Override
    public String toString() {
        return "Employees from " + name;
    }
}
