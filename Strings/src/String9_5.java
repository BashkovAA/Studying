import java.util.Scanner;

public class String9_5 {
    public static void main(String[] args) {
        System.out.println("Введите фамилию имя отчество:");
        String header = new Scanner(System.in).nextLine();
        System.out.println(getEncoding(header));
    }
    public static String getEncoding(String header) {
        String space = " ";
        int endSurname = header.indexOf(space);
        int beginPatronymic = header.lastIndexOf(space);

        String surname = header.substring(0, endSurname);
        String name = header.substring(endSurname, beginPatronymic);
        String patronymic = header.substring(beginPatronymic);

        String template = "Фамилия: %s" + "\n" + "Имя: %s" + "\n" + "Отчетсво: %s";
        String result = String.format(template, surname, name, patronymic);
        return result;
    }
}
