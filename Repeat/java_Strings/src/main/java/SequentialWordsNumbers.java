import java.util.Scanner;

public class SequentialWordsNumbers {
    public static void main(String[] args) {
        System.out.println("Введите текст:");
        String text = new Scanner(System.in).nextLine().trim();
        System.out.println(sequentialWordsNumbers(text));
    }

    private static String sequentialWordsNumbers(String text) {
        String result = "";
        int i = 1;
        int end = 0;
        StringBuilder newText = new StringBuilder();
        text += "\s";
        int start = 0;

        while (end >= 0) {
            end = text.indexOf(" ", start);

            if (end >= 0) {
                newText.append("(" + i++ + ")" + "\s").append(text.substring(start, end)).append("\s");
                start = end + 1;
            }
        }
        result = newText.toString().trim();
        return result;
    }
}
