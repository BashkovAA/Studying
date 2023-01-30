import java.util.Scanner;

public class Main {
    private static EmailList emailList = new EmailList();

    public static void main(String[] args) {
        while (true) {
            String command = new Scanner(System.in).nextLine().trim();
            String[] partCommand = command.split("\s+");
            int start = command.indexOf("\s");

            switch (partCommand[0]) {
                case "ADD" :
                    emailList.addEmail(command.substring(start).trim());
                    break;
                case "LIST" :
                    emailList.list();
                    break;
                default :
                    System.out.println("Неверный ввод команды");
                    break;
            }
        }
    }
}
