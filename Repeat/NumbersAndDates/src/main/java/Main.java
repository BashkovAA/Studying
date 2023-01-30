import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println(getPeriodJavaBirthday());
    }
    private static String getPeriodJavaBirthday() {
        LocalDate javaBirth = LocalDate.of(1995, 5, 23);
        Period period = javaBirth.until(LocalDate.now());
        return period.getYears() + " years, " +
                period.getMonths() + " months, " +
                period.getDays() + " days";
    }
}
