import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 100;
        int value = new Random().nextInt(number);

        while (true) {
            System.out.println("Попробуйте отгадать число от 0 до " + number);
            int attempt = new Scanner(System.in).nextInt();
            if (attempt == value) {
                System.out.println("Вы угадали");
                break;
            } else if (attempt > value) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
    }
}
