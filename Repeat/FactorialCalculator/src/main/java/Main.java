import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число");
        int value = new Scanner(System.in).nextInt();

        int factorial = 1;
        for (int i = 2; i<=value; i = i +1) {
            if (value == 0 || value == 1) {
                System.out.println("Факториал: " + factorial);
                break;
            }
            factorial = factorial * i;
        }
        System.out.println("Факториал: " + factorial);
    }
}
