import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String name = "Дмитрий";
        String surname = "Петров";
        LocalDate birthday = LocalDate.of(1996, 11, 4);

        String fullName = name + " " + surname + " - " + birthday;
        System.out.println(fullName);
    }
}
