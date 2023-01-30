import java.util.Collections;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Company company = new Company("Orcs", 150_000_000);

        hirePersonal(company);
        System.out.println("\n");

        listTopSalary(company);
        System.out.println("\n");

        listLowestSalary(company);
        System.out.println("\n");

        fire50Percent(company);
        System.out.println("\n");

        listTopSalary(company);
        System.out.println("\n");

        listLowestSalary(company);
        System.out.println("\n");
    }

    public static void hirePersonal(Company company) {

        for (int i = 0; i < 180; i++) {
            CompanyEmployees operator = new Operator();
            company.hire(operator);
        }

        for (int i = 0; i < 80; i++) {
            CompanyEmployees manager = new Manager();
            company.hire(manager);
        }

        for (int i = 0; i < 10; i++) {
            CompanyEmployees topManager = new TopManager(150_000_000);
            company.hire(topManager);
        }

        System.out.println("Нанято сотрудников: " + company.getCountEmployees());
    }

    public static void fire50Percent(Company company) {
        int halfCountEmployees = company.getCountEmployees() / 2;

        for (int i = 0; i < halfCountEmployees; i++) {
            int index = (int) Math.random() * halfCountEmployees;
            Employee fired = company.getEmployees().get(index);
            company.fire(fired);
        }
        System.out.println("Уволено сотрудников: " + halfCountEmployees);
    }

    public static void listTopSalary(Company company) {
        System.out.println("Самые высокие зарплаты ");
        for (Employee employee : company.getTopSalaryStaff(11)) {
            System.out.println(employee + " руб.");
        }
    }

    public static void listLowestSalary(Company company) {
        System.out.println("Самые низкие зарплаты ");
        for (Employee employee : company.getLowestSalaryStaff(30)) {
            System.out.println(employee + " руб.");
        }
    }

    public static void allEmployeesPrint(Company company) {
        for (Employee employee : company.getEmployees()) {
            System.out.println(employee);
        }
    }
}
