import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {
    TreeSet emailList = new TreeSet();

    public void addEmail(String email) {
        Pattern pattern = Pattern.compile("[\\w]+[@\\w]+\\.[\\w]{2,3}");
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            email = email.toLowerCase(Locale.ROOT);
            emailList.add(email);
        } else {
            System.out.println("Неверный формат email");
        }
    }

    public void list() {
        for (Object email: emailList) {
            System.out.println(email);
        }
    }
}
