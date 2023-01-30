import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        todoList.add("Первое наше дело");
        todoList.add("Второе наше дело");

        for(int i = 0; i < todoList.size(); i++) {
            System.out.println(todoList.get(i));
        }
        System.out.println(todoList.size());
    }
}
