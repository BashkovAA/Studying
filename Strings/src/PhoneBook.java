package practice;

import java.util.*;

public class PhoneBook {
    private String saveKey = "";
    Scanner scanner = new Scanner(System.in);
    HashMap<String, String> phoneBook = new HashMap<>();

    public void addContact(String phone, String name) {
        if (isPhone(phone) && isName(name)) {
            if (phoneBook.containsValue(name)) {
                addPhoneNumber(phone, name);
            } else {
                phoneBook.put(phone, name);
            }
        } else if (isPhone(phone) && name.equals("")) {
            addByPhone(phone, name);
        } else if (isName(name) && phone.equals("")) {
            addByName(phone, name);
        } else {
            System.out.println("Неверный формат ввода");
        }

        // проверьте корректность формата имени и телефона
        // (рекомедуется написать отдельные методы для проверки является строка именем/телефоном)
        // если такой номер уже есть в списке, то перезаписать имя абонента
    }
    public void addByPhone(String phone, String name) {

        if (!phoneBook.containsKey(phone)) {
            System.out.println("Такого номера нет в телефонной книге.");
            System.out.println("Введите имя абонента для номера " + phone);
            name = scanner.nextLine();
            String output = (isName(name)) ? "Контакт сохранен!" : "Неверный формат ввода";

            switch (output) {
                case "Контакт сохранен!" :
                    if (phoneBook.containsValue(name)) {
                        addPhoneNumber(phone, name);
                    } else {
                        phoneBook.put(phone, name);
                    }
                    break;
                case "Неверный формат ввода" :
                    break;
            }
            System.out.println(output);
        } else {
            System.out.println(getContactByPhone(phone));
        }
    }

    public void addByName(String phone, String name) {
        if (!phoneBook.containsValue(name)) {
            System.out.println("Такого имени в телефонной книге нет.");
            System.out.println("Введите номер абонента " + name);
            phone = scanner.nextLine();
            String output = (isPhone(phone)) ? "Контакт сохранен!" : "Неверный формат ввода";

            switch (output) {
                case "Контакт сохранен!" :
                    phoneBook.put(phone, name);
                    break;
                case "Неверный формат ввода" :
                    break;
            }
            System.out.println(output);
        } else {
            String output = getContactByName(name).toString().replaceFirst("\\[", "").replaceFirst("\\]", "");
            System.out.println(output);
        }
    }

    public void addPhoneNumber(String phone, String name) {
        for (String key : phoneBook.keySet()) {
            if (phoneBook.get(key).equals(name)) {
                saveKey = key;
            }
        }
        String key = saveKey;
        String newNumber = key.concat(", ").concat(phone);
        phoneBook.put(newNumber, name);
        phoneBook.remove(saveKey, name);
    }


    public boolean isPhone(String phone) {
        String regexPhone = "7{1}[0-9]{10}";
        return phone.matches(regexPhone);
    }

    public boolean isName(String name) {
        String regexName = "[А-Яа-яA-Za-z]+";
        return name.matches(regexName);
    }

    public String getContactByPhone(String phone) {
        String search = "";
        if (phoneBook.containsKey(phone)) {
            String name = phoneBook.get(phone);
            search = name.concat(" - ").concat(phone);
        }
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        return search;
    }

    public Set<String> getContactByName(String name) {
        TreeSet<String> setPhoneBook = new TreeSet<>();
        String search = "";
        if (phoneBook.containsValue(name)) {
            for (String phone : phoneBook.keySet()) {
                if (phoneBook.get(phone).equals(name)) {
                    search = search.concat(name).concat(" - ").concat(phone);
                    setPhoneBook.add(search);
                }
            }
        }
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        return setPhoneBook;
    }

    public Set<String> getAllContacts() {
        TreeSet<String> treePhoneBook = new TreeSet<>();
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            String namePhone = "";
            String phone = entry.getKey();
            String name = entry.getValue();
            namePhone = namePhone.concat(name).concat(" - ").concat(phone);
            treePhoneBook.add(namePhone);
        }
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        return treePhoneBook;
    }

    // для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
    // это поможет вам найти все ключи (key) по значению (value)
    /*
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения ключа
        }
    */
}