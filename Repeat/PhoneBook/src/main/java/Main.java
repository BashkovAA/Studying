import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class Main {
    static boolean check;
    static String command = "";
    static String phone = "";
    static String name = "";
    static String namePattern = "[А-Яа-я]+";
    static String phonePattern = "7[0-9]{10}";
    static PhoneBook phoneBook = new PhoneBook(new TreeMap<>());

    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите номер, имя или команду");
            command = new Scanner(System.in).nextLine().trim();

            if (command.matches(namePattern)) {
                name = command;
                System.out.println(phoneBook.existName(name));
                if (!check) {
                    System.out.println(phoneBook.addContact(command));
                }
            } else if (command.matches(phonePattern)) {
                phone = command;
                System.out.println(phoneBook.existPhone(phone));
                if (!check) {
                    System.out.println("Введите имя абонента для номера ".concat("'").concat(phone).concat("'"));
                    name = new Scanner(System.in).nextLine();
                    System.out.println(phoneBook.addPhone(name, phone));
                }
            } else if (command.equals("LIST")) {
                phoneBook.list();
            }
        }
    }
}
//79283668077
//79283458092
//79283558094
// Маша Паша