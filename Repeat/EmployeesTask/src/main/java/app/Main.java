package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {

    private static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = EmployeeUtils.loadStaffFromFile(STAFF_TXT);

        Employee employeeMaxSalary = findEmployeeWithHighestSalary(staff, 2017);
        System.out.println(employeeMaxSalary);
    }

    public static Employee findEmployeeWithHighestSalary(List<Employee> staff, int year) {
        //TODO Метод должен вернуть сотрудника с максимальной зарплатой среди тех,
        // кто пришёл в году, указанном в переменной year
        LocalDate needYear = LocalDate.of(2016, 12, 31);
        List filter = staff.stream().filter(employee -> employee.getWorkStart().getYear() == year).toList();
        Employee employeeMaxSalary = (Employee) filter.stream().max(Comparator.comparing(Employee::getSalary)).get();
        return employeeMaxSalary;
    }
}