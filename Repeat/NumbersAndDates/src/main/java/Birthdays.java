import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Birthdays {
    public static void main(String[] args) {
//        System.out.println("Введите год рождения:");
//        int year = new Scanner(System.in).nextInt();
//        System.out.println("Введите месяц рождения:");
//        int month = new Scanner(System.in).nextInt();
//        System.out.println("Введите день рождения:");
//        int day = new Scanner(System.in).nextInt();
        int year = 1990;
        int month = 12;
        int day = 11;

        System.out.println(collectBirthdays(year, month, day));
    }

    public static String collectBirthdays(int year, int month, int day) {
        LocalDate birthDay = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - EEE").localizedBy(new Locale("us"));
        String allBirthdays = "";
        LocalDate today = LocalDate.now();
        for (int i = 0; today.isAfter(birthDay.plusYears(i)) || today.isEqual(birthDay.plusYears(i)); i++) {
            allBirthdays = allBirthdays + i + " - " + formatter.format(birthDay.plusYears(i)) + System.lineSeparator();
        }
        return allBirthdays;
    }
}
