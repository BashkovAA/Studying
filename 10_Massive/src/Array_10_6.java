import java.util.ArrayList;

public class Array_10_6 {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();

        todoList.add("Первое наше дело");
        todoList.add(1,"Второе дело");

        for (String item : todoList) {
            System.out.println(item);
        }
    }
}
