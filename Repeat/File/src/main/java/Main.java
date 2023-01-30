import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        try{
            BufferedReader file = new BufferedReader(new FileReader("A:\\Conan.txt"));
            for(;;) {
                String line = file.readLine();
                if (line == null) {
                    break;
                }
                builder.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(builder);
    }
}
