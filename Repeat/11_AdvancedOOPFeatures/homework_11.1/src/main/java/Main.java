import java.util.Comparator;
import java.util.List;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        System.out.println(staff);
        sortBySalaryAndAlphabet(staff);
        System.out.println(staff);
    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {
        staff.sort((employee1, employee2) -> {
            int comparison = employee1.getSalary().compareTo(employee2.getSalary());
            if (comparison == 0) {
                return employee1.getName().compareTo(employee2.getName());
            }
            return comparison;
        });
//        staff.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
        //TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.
    }
}