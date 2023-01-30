import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>todoList = new ArrayList<>() {{
            add("Первое дело");
            add("Второе дело");
        }};
        todoList.add("Третье дело");
        todoList.remove(0);

        for (String item : todoList) {
            System.out.println(item);
        }
    }
}
