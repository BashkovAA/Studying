import java.text.DateFormat;
import java.time.LocalDate;
import java.util.*;

public class Main {

    private static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        Employee employeeMaxSalary = findEmployeeWithHighestSalary(staff, 2017);
        System.out.println(employeeMaxSalary);
    }

    public static Employee findEmployeeWithHighestSalary(List<Employee> staff, int year) {
        //TODO Метод должен вернуть сотрудника с максимальной зарплатой среди тех,
        // кто пришёл в году, указанном в переменной year

        List<Employee> filter = staff.stream().filter(employee -> (employee.getWorkStart().getYear() == year)).toList();
        filter.forEach(System.out::println);
        Employee employeeWithMaxSalary = (Employee) filter.stream().max(Comparator.comparing(Employee::getSalary)).get();
        return employeeWithMaxSalary;
    }
}