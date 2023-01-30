import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;

public class NumberYears {
    public static void main(String[] args) {
        System.out.println(getPeriodFromJavaBirthday());
    }
    public static String getPeriodFromJavaBirthday() {
        LocalDate birthday = LocalDate.of(1995, 05,23);
        Period period = birthday.until(LocalDate.now());
        return period.getYears() + " - Годы, " +
                period.getMonths() + " - Месяцы, " +
                period.getDays() + " - Дни";
    }
}
