import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String9_6_2 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите числа для суммирования:");
            String numbers = new Scanner(System.in).nextLine();
            int sum = 0;

            Pattern pattern = Pattern.compile("[0-9]+");
            Matcher matcher = pattern.matcher(numbers);

            while (matcher.find()) {
                String number = matcher.group();
                sum += Integer.parseInt(number);
            }
            System.out.println("Сумма чисел: " + sum);
        }
    }
}
