import javax.swing.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class TodoList {
    ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        todoList.add(todo);
        System.out.println("Добавлено дело: " + todo);
    }

    public void add(int index, String text) {
        if (index >= 0 && index < todoList.size()) {
            todoList.add(index, text);
            System.out.println("Добавлено дело " + text);
        } else {
            todoList.add(text);
            System.out.println("Добавлено в конец списка, дело: " + text);
        }
    }

    public void list() {
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i + " - " + todoList.get(i));
        }
    }

    public void edit(int index, String text) {
        String textOld = todoList.get(index);
        todoList.remove(index);
        todoList.add(index, text);
        System.out.println("Дело " + textOld + " заменено на " + text);
    }

    public void delete(int index) {
        String textOld = todoList.get(index);
        todoList.remove(index);
        System.out.println("Дело " + textOld + " удалено");
    }
}
