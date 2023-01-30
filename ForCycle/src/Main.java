import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        int value = new Scanner(System.in).nextInt();

        if (value >=1 ) {
            for (int i = 1; i <= value; i++) {
                if (value % i == 0) {
                    x = value / i;
                    System.out.println(x + "*" + i);
                }
            }
        } else {
            System.out.println("Введено не положительное целое число");
        }
    }
}
