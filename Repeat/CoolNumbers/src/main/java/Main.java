import java.util.*;

public class Main {
    public static void main(String[] args) {
        int countAutoNumbers = 2_000_000;
        CoolNumbers coolNumbers = new CoolNumbers();
        String search = "У444АА179";

        ArrayList numbersOne = new ArrayList(coolNumbers.createCoolNumbers(countAutoNumbers));
        HashSet numbersTwo = new HashSet<>(numbersOne);
        TreeSet numbersThree = new TreeSet<>(numbersOne);

        straightSearch(numbersOne, search);
        binarySearch(numbersOne, search);
        hashSearch(numbersTwo, search);
        treeSearch(numbersThree, search);
    }

    public static void straightSearch(ArrayList<String> arrayList, String search) {
        double end = 0.0;
        double timeSearch = -1.0;
        double start = System.nanoTime();
        for (String auto : arrayList) {
            if (search.equals(auto)) {
                end = System.nanoTime();
                timeSearch = end - start;
                System.out.println("Поиск перебором: номер найден " + timeSearch + " нс");
                break;
            }
        }
        if (timeSearch < 0) {
            end = System.nanoTime();
            timeSearch = end - start;
            System.out.println("Поиск перебором: номер не найден " + timeSearch + " нс");
        }
    }

    public static void binarySearch(ArrayList<String> arrayList, String search) {
        Collections.sort(arrayList);
        int index = -1;
        double start = System.nanoTime();
        index = Collections.binarySearch(arrayList, search);
        double end = System.nanoTime();
        double timeSearch = end - start;
        if (index >= 0) {
            System.out.println("Бинарный поиск: номер найден " + timeSearch + " нс");
        } else {
            System.out.println("Бинарный поиск: номер не найден " + timeSearch + " нс");
        }
    }

    public static void hashSearch(HashSet hashSet, String search) {
        double start = System.nanoTime();
        if (hashSet.contains(search)) {
            double end = System.nanoTime();
            double timeSearch = end - start;
            System.out.println("Поиск в HashSet: номер найден " + timeSearch + " нс");
        } else {
            double end = System.nanoTime();
            double timeSearch = end - start;
            System.out.println("Поиск в HashSet: номер не найден " + timeSearch + " нс");
        }
    }

    public static void treeSearch(TreeSet treeSet, String search) {
        double start = System.nanoTime();
        if (treeSet.contains(search)) {
            double end = System.nanoTime();
            double timeSearch = end - start;
            System.out.println("Поиск в TreeSet: номер найден " + timeSearch + " нс");
        } else {
            double end = System.nanoTime();
            double timeSearch = end - start;
            System.out.println("Поиск в TreeSet: номер не найден " + timeSearch + " нс");
        }
    }
}
