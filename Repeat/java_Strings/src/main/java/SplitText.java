import java.util.Scanner;

public class SplitText {
    public static void main(String[] args) {
        System.out.println("Введите текст:");
        String text = new Scanner(System.in).nextLine();
        System.out.println(splitText(text));
    }

    public static String splitText(String text) {
        text = text.replaceAll("[^a-zA-Z]", "\s");
        String[] split = text.split("\s+");
        String result = "";

        for (int i = 0; i < split.length; i++) {
           result = result.concat(split[i]).concat("\n");
        }
        return result;
    }
}
