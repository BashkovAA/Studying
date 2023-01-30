import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    private static String staffFile = "data/staff.txt";
    private static String dateFormat = "dd.MM.yyyy";

    public static void main(String[] args) {
        ArrayList<Employee> staff = loadStaffFromFile();
//        LRUCache<Employee> cache = new LRUCache<>(5);
//        for (Employee employee : staff) {
//            cache.addElement(employee);
//        }
//        cache.getAllElements().forEach(System.out::println);

//        staff.stream()
//                .map(e -> e.getSalary())
//                .filter(s -> s >= 100_000)
//                .reduce((s1, s2) -> s1 + s2)
//                .ifPresent(System.out::println);

        staff.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

//        staff.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);

//        Collections.sort(staff, Comparator.comparing(Employee::getSalary));
//        for (Employee employee : staff) {
//            System.out.println(employee);
//        }
//        System.out.println("Old salaries:");
//        staff.forEach(System.out::println);
//
//        int salaryIncrease = 10_000;
//        staff.forEach(e -> e.setSalary(e.getSalary() + salaryIncrease));
//
//        System.out.println("\nNew salaries:");
//        staff.forEach(System.out::println);

//        Stream<Employee> stream = staff.stream();
//        stream.filter(employee -> employee.getSalary() >= 100_000).forEach(System.out::println);


    }

    private static ArrayList<Employee> loadStaffFromFile() {
        ArrayList<Employee> staff = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(staffFile));
            for (String line : lines) {
                String[] fragments = line.split("\\t");
                if (fragments.length != 3) {
                    System.out.println("Wrong line: " + line);
                    continue;
                }
                staff.add(new Employee(
                        fragments[0],
                        Integer.parseInt(fragments[1]),
                        (new SimpleDateFormat(dateFormat).parse(fragments[2]))
                ));
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return staff;
    }
}
