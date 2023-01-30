import java.lang.reflect.Array;

public class ReverseArray {
    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d"};
        for(String element : reverse(array)) {
            System.out.println(element);
        }
    }
    public static String[] reverse(String[] array) {
        String[] reverse = new String[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++) {
            reverse[j - i] = array[i];
        }
        return array = reverse;
    }
}
