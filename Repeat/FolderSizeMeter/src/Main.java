import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static String[] sizeNames =
            {"b", "kb", "Mb", "Gb"};
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите путь к папке или файлу:");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            System.out.println(getHumanReadableSize(getFolderSize(file)));
        }
    }

    public static long getFolderSize(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long size = 0;
        File[] files = file.listFiles();
        for (File file1 : files) {
            size += getFolderSize(file1);
        }
        return size;
    }

    public static String getHumanReadableSize(long size) {
//        if (size / (1024 * 1024 * 1024) > 1) {
//            return String.valueOf(size / (1024 * 1024 * 1024)).concat("Gb");
//        } else if (size / (1024 * 1024) > 1) {
//            return String.valueOf(size / (1024 * 1024)).concat("Mb");
//        } else if (size / (1024) > 1) {
//            return String.valueOf(size / 1024).concat("Kb");
//        } else {
//            return String.valueOf(size).concat("b");
//        }
        int power = (int) (Math.log(size) / Math.log(1024));
        double value = size / Math.pow(1024, power);
        double roundedValue = Math.round(value * 100) / 100.;
        return roundedValue + " " + sizeNames[power];
    }
}
//A:\\DataBase