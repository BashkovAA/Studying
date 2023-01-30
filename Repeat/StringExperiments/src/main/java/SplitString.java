import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите ФИО");
            String SNP = new Scanner(System.in).nextLine().trim();

            int startName = SNP.indexOf(" ");
            int finalName = SNP.lastIndexOf(" ");

            String surname = SNP.substring(0, startName);
            String name = SNP.substring(++startName, finalName);
            String patronymic = SNP.substring(++finalName);

            System.out.println("Фамилия: " + surname);
            System.out.println("Имя: " + name);
            System.out.println("Отчество: " + patronymic);
        }
    }
}
