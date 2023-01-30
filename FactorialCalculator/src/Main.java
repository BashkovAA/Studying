import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите число: ");

        int value = new Scanner(System.in).nextInt();
        int factorialValue = 1;

        if (value >= 0) {
            if (0 <= value && value <= 1) {
                System.out.println("Факториал: " + factorialValue);
            } else {
                for (int i = 1; i < value; i++) {
                    factorialValue = factorialValue * (i + 1);
                }
                System.out.println("Факториал: " + factorialValue);
            }
        } else {
            System.out.println("Вы ввели отрицательное или дробное число, " +
                    "факториал это функция, определённая на множестве неотрицательных целых чисел");
        }
    }
}
