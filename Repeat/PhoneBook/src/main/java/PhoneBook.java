import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
    String contact = "";
    String phone = "";
    TreeMap<String, HashSet<String>> phoneBook = new TreeMap<>();

    public PhoneBook(TreeMap<String, HashSet<String>> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public String existName(String name) {
        if (phoneBook.containsKey(name)) {
            String phone = String.valueOf(phoneBook.get(name));
            contact = name.concat(" - ").concat(phone);
            Main.check = true;
            return contact;
        }
        Main.check = false;
        return "Такого имени в телефонной книге нет.";
    }

    public String existPhone(String phone) {
        if (phoneBook.containsValue(phone)) {
            for (Map.Entry<String, HashSet<String>> contacts : phoneBook.entrySet()) {
                if (contacts.getValue().equals(phone)) {
                    contact = contacts.getKey().concat(" - ").concat(String.valueOf(contacts.getValue()));
                    Main.check = true;
                    return contact;
                }
            }
        }
        Main.check = false;
        return "Такого номера нет в телефонной книге.";
    }

    public String addContact(String name) {
        System.out.println("Введите номер телефона для абоннета ".concat("'").concat(name).concat("'"));
        phone = new Scanner(System.in).nextLine().trim();
        if (phone.matches(Main.phonePattern)) {
            phoneBook.put(name, new HashSet<>());
            phoneBook.get(name).add(phone);
            return "Контакт сохранён!";
        }
        return "Неверный формат ввода";
    }

    public String addPhone(String name, String phone) {
        for (Map.Entry<String, HashSet<String>> contacts : phoneBook.entrySet()) {
            if (contacts.getKey().equals(name)) {
                contacts.getValue().add(phone);
                return "Контакт сохранён!";
            }
        }
        phoneBook.put(name, new HashSet<String>());
        phoneBook.get(name).add(phone);
        return "Контакт сохранён!";
    }

    public void list() {
        for (Map.Entry<String, HashSet<String>> contacts : phoneBook.entrySet()) {
            phone = phone.join(", ", contacts.getValue());
            contact = contacts.getKey().concat(" - ").concat(phone);
            System.out.println(contact);
        }
    }
}
