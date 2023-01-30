package practice;

import java.util.Scanner;

public class ForPhoneBook {

    public static void main(String[] args) {
        practice.PhoneBook phoneBook = new practice.PhoneBook();
        phoneBook.addContact("79283458092", "Петя");
        phoneBook.addContact("79283458080", "Петя");

        while (true) {
            String phone = "";
            String name = "";
            System.out.println("Введите номер, имя или команду:");
            String input = new Scanner(System.in).nextLine();
            if (input.equals("LIST")){
                for (String contact : phoneBook.getAllContacts()) {
                    System.out.println(contact.replaceAll("\\[", "").replaceAll("\\]", ""));
                }
                continue;
            } else if (input.matches("\\d+")) {
                phone = input;
            } else if (input.matches("\\D+")) {
                name = input;
            }
            phoneBook.addContact(phone, name);
            System.out.println("");
        }
    }
}
//79283668077
//79283458092
//79283558094