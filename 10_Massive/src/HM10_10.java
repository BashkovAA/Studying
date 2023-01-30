import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HM10_10 {
    public static void main(String[] args) {
        HashMap<String, Integer> good2Count = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for(;;) {
            String goodName = scanner.nextLine();

            if(goodName.equals("LIST")) {
                printMap(good2Count);
                continue;
            }
            int count = 1;
            if (good2Count.containsKey(goodName)) {
                count = good2Count.get(goodName) + 1;
            }
            good2Count.put(goodName, count);
        }
    }
    private static void printMap(Map<String, Integer> map) {
        for ( String key : map.keySet()) {
            System.out.println(key + " => " + map.get(key));
        }
    }
}
