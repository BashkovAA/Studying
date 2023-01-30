import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Башков Александр Александрович
public class String9_6 {
    public static void main(String[] args) {
        System.out.println("Введите Ф.И.О.");
        String snp = new Scanner(System.in).nextLine();
        System.out.println(splitSNP(snp));
        String[] words = snp.split("\s+");

        for (int i = 0; i < words.length; i++) {

            switch (i) {
                case 0 :
                    System.out.println("Split method Surname: " + words[0]);
                    break;
                case 1 :
                    System.out.println("Split method Name: " + words[1]);
                    break;
                case 2 :
                    System.out.println("Split method Patronymic: " + words[2]);
                    break;
            }
        }

        while (true) {
            System.out.println("Введите Ф.И.О.");
            String snp2 = new Scanner(System.in).nextLine();
            String[] word = snp2.split("\s+");

            System.out.println("Фамилия: " + word[0]);
            System.out.println("Имя: " + word[1]);
            System.out.println("Отчесвто: " + word[2]);
        }
    }
    public static String splitSNP(String snp) {
        String regex = "[^\\s]+[\\s]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(snp);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Pattern method: " + snp.substring(start, end));
        }
        return "";
    }
}
