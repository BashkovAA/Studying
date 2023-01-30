import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SumNumbers {
    public static void main(String[] args) {
        System.out.println("Введите текст с числами:");
        String text = new Scanner(System.in).nextLine();
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(text);
        int sum = 0;

        while (matcher.find()) {
            String number = matcher.group();
            sum += Integer.parseInt(number);
        }

        System.out.println("Сумма всех чисел в предложениии: " + sum);
    }
}
