import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static TodoList todoList = new TodoList();

    public static void main(String[] args) {

        while (true) {
            String command = new Scanner(System.in).nextLine();
            command = command.trim();
            String[] partCommand = command.split("\\s+");
            int start = 0;
            int index = 0;
            String text = "";


            switch (partCommand[0]) {
                case "ADD": {
                    start = command.indexOf("\s+");
                    if (Character.isDigit(partCommand[1].charAt(0))) {
                        index = Integer.parseInt(partCommand[1]);
                        start += partCommand[1].length();
                        text = command.substring(start).trim();
                        todoList.add(index, text);
                    } else {
                        text = command.substring(start).trim();
                        todoList.add(text);
                    }
                }

                    break;

                case "LIST": {
                    todoList.list();
                }
                    break;

                case "EDIT": {
                    start = command.indexOf("\s+");
                    if (Character.isDigit(partCommand[1].charAt(0))) {
                        index = Integer.parseInt(partCommand[1]);
                        start += partCommand[1].length();
                        text = command.substring(start).trim();
                        todoList.edit(index, text);
                        System.out.println("Не указан номер меняемого дела");
                    }
                }
                    break;
                case "DELETE": {
                    start = command.indexOf("\s+");
                    if (Character.isDigit(partCommand[1].charAt(0))) {
                        index = Integer.parseInt(partCommand[1]);
                        todoList.delete(index);
                    } else {
                        System.out.println("Не указан номер удаляемого дела");
                    }
                }
                    break;
                default:
                    System.out.println("Неверная команда");
                    break;
            }
        }
    }
}
