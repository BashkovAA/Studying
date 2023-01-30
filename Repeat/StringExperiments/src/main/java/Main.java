import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите текст:");
            String text = new Scanner(System.in).nextLine();

            System.out.println("Введите исходную кодировку:");
            String srcEncoding = new Scanner(System.in).nextLine();
            Charset src = Charset.forName(srcEncoding);

            System.out.println("Введите целевую кодировку:");
            String finalEncoding = new Scanner(System.in).nextLine();
            Charset encoded = Charset.forName(finalEncoding);

            String encodedText = new String(text.getBytes(src), encoded);

            System.out.println("Результат: " + encodedText);
        }
    }
}
