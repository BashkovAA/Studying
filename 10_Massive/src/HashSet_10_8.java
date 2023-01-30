import java.util.ArrayList;
import java.util.HashSet;

public class HashSet_10_8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> words = new HashSet<>();

        words.add("Первое");
        words.add("Второе");
        words.add("Третье");
        words.add("Второе");

        for (String word : words) {
            System.out.println(word);
        }
        System.out.println(words.contains("Второе"));
    }
}
