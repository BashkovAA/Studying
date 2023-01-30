import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class String9_4 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите текст:");
            String text = new Scanner(System.in).nextLine();
            System.out.println("Введите имя исходной кодировки:");
            String srcEncoding = new Scanner(System.in).nextLine();
            System.out.println("Введите имя целевой кодировки:");
            String finalEncoding = new Scanner(System.in).nextLine();
            String encodedText = null;
            try {
                encodedText = new String(text.getBytes(srcEncoding), finalEncoding);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            System.out.println("Результат: " + encodedText);
        }
    }
}
