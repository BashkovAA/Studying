import java.util.Scanner;

public class PhoneCleanerRegex {
    public static void main(String[] args) {
        System.out.println("Введите номер:");
        String phone = new Scanner(System.in).nextLine();
        System.out.println(phoneCleanerRegex(phone));
    }
    public static String phoneCleanerRegex(String phone) {
        String correctPhone = phone.replaceAll("[^0-9]", "");

        if (correctPhone.length() == 10) {
            correctPhone = "7".concat(correctPhone);
        }

        if (correctPhone.charAt(0) == '8') {
            correctPhone = correctPhone.replaceFirst("8", "7");
        }

        if (correctPhone.length() != 11 || correctPhone.charAt(0) != '7') {
            return "Неверный формат ввода";
        }

        return correctPhone;
    }
}
