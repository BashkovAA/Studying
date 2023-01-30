import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Study {
    public static void main(String[] args) {
//        try {
//            PrintWriter printWriter = new PrintWriter("data\\info.txt");
//            for (int i = 0; i < 1000; i++) {
//                printWriter.write(i + "\n");
//            }
//            printWriter.flush();
//            printWriter.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {
            ArrayList<String> strings = new ArrayList<>();
            for (int i = 0; i < 1000; i++) {
                strings.add(Integer.toString(i));
            }

            Files.write(Paths.get("data\\file.txt"), strings);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
