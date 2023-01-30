import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите число");
            int value = new Scanner(System.in).nextInt();
            if (value < 1) {
                System.out.println("Вы ввели число меньше еденицы");
                continue;
            }
            for (int i = 1; i <= value; i = i + 1) {
                for (int a = value; a >= 1; a = a - 1) {
                    int couple = i * a == value ? i * a : 0;
                    if (couple == value) {
                        System.out.println(i + " * " + a);
                    }
                }
            }
        }
    }
}
