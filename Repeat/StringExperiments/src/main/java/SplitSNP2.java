import java.util.Scanner;

public class SplitSNP2 {
    public static void main(String[] args) {
        System.out.println("Введите ФИО:");
        String[] SNP = new Scanner(System.in).nextLine().split("\\s+");

        if (SNP.length == 3) {
            System.out.println("Фамилия: " + SNP[0]);
            System.out.println("Имя: " + SNP[1]);
            System.out.println("Отчество: " + SNP[2]);
        } else {
            System.out.println("Вы ввели некоректные данные");
        }
    }
}
