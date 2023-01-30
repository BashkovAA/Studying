import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);

        while (true) {
            System.out.println("Попробуйте угадать число :)) ");
            int attempt = new Scanner(System.in).nextInt();
            if (attempt == value) {
                System.out.println("Вы угадали!)");
                break;
            } else if (attempt > value) {
                System.out.println("Введенное число больше");
            } else {
                System.out.println("Введенное число меньше");
            }
        }
    }
}
