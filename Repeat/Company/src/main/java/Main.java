import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Company apple = new Company("Apple", 11_000_000);

        hirePersonal(apple);
        System.out.println("\n");

        printTopSalary(apple, 10);
        System.out.println("\n");

        printLowestSalary(apple, 30);
        System.out.println("\n");

        fire(apple);
        System.out.println("\n");

        printTopSalary(apple, 10);
        System.out.println("\n");

        printLowestSalary(apple, 30);
        System.out.println("\n");

        printAllStaffCompany(apple);
        System.out.println(apple.getCompanyStaff().size());
    }

    private static void hirePersonal(Company company) {
        for (int i = 0; i < 180; i++) {
            Employee operator = new Operator(100_000);
            company.hire(operator);
        }

        for (int i = 0; i < 80; i++) {
            Employee manager = new Manager(110_000);
            company.hire(manager);
        }

        for (int i = 0; i < 10; i++) {
            Employee topManager = new TopManager(110_000, company.getIncome());
            company.hire(topManager);
        }

        System.out.println("Hire employees " + company.getCountEmployees());
    }

    private static void printTopSalary(Company company, int count) {
        System.out.println("Top salaries: ");
        for (Employee employee : company.getTopSalaryStaff(count)) {
            System.out.println(employee);
        }
    }

    private static void printLowestSalary(Company company, int count) {
        System.out.println("Lowest salaries: ");
        for (Employee employee : company.getLowestSalaryStaff(count)) {
            System.out.println(employee);
        }
    }

    private static void printAllStaffCompany(Company company) {
        for (Employee employee : company.getCompanyStaff()) {
            System.out.println(employee);
        }
    }

    private static void fire(Company company) {
        int halfStaff = company.getCountEmployees() / 2;
        for (int i = 0; i < halfStaff; i++) {
            int index = new Random().nextInt(0, company.getCountEmployees());
            Employee employee = company.getCompanyStaff().get(index);
            company.fire(employee);
        }
        System.out.println("Employees have fired: " + halfStaff);
    }

}
