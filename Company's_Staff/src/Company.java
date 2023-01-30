import java.util.*;

public class Company {
    private final List<CompanyEmployees> employees = new ArrayList<>();
    private String name = "";
    private int income;

    public Company(String name, int income) {
        this.name = name;
        this.income = income;
    }

    public void hire(CompanyEmployees employee) {
        this.employees.add(employee);
    }

    public void hireAll(List<CompanyEmployees> employees) {
        this.employees.addAll(employees);
    }

    public void fire(Employee employee) {
        this.employees.remove(employee);
    }

    public int getIncome() {
        return income;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        if (count < 0 || count > employees.size()) {
            count = count > employees.size()? employees.size() : 1;
        }

        Collections.sort(employees);

        ArrayList<Employee> topSalaryStaff = new ArrayList<>();

        for (int i = employees.size() - count; i < employees.size(); i++) {
            topSalaryStaff.add(employees.get(i));
        }
        return topSalaryStaff;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        if (count < 0 || count > employees.size()) {
            count = count > employees.size()? employees.size() : 1;
        }

        Collections.sort(employees);

        ArrayList<Employee> lowestSalaryStaff = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            lowestSalaryStaff.add(employees.get(i));
        }
        return lowestSalaryStaff;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employees from " + name;
    }

    public int getCountEmployees() {
        return employees.size();
    }

    public List<CompanyEmployees> getEmployees() {
        return employees;
    }
}
