import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите строку:");
            String str1 = new Scanner(System.in).next();

            System.out.println("Введите строку:");
            String str2 = new Scanner(System.in).next();

            int comparison = str1.compareTo(str2);

            if (comparison < 0) {
                System.out.println(str1.concat(" < ").concat(str2));
            } else if (comparison > 0) {
                System.out.println(str1.concat(" > ").concat(str2));
            } else {
                System.out.println(str1.concat(" = ").concat(str2));
            }
        }
    }
}
