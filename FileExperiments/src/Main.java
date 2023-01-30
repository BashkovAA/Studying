import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {
    public static void main(String[] args) {
        String path = "A:\\";
        String path2 = "A:\\DataBase\\output.txt";
        String in = path + "folder";
        String out = "A:\\archive.zip";

        try {
            FileOutputStream outputStream = new FileOutputStream(out);
            ZipOutputStream zipOut = new ZipOutputStream(outputStream);
            writeFileToZip(new File(in), zipOut, "");
            zipOut.flush();
            zipOut.close();
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeFileToZip(File file, ZipOutputStream zipOut, String path)
            throws Exception {
        if (file.isDirectory()) {
            String folder = path + file.getName() + "\\";
            ZipEntry entry = new ZipEntry(folder);
            zipOut.putNextEntry(entry);
            zipOut.closeEntry();
            File[] files = file.listFiles();
            for (File subfile : files) {
                writeFileToZip(subfile, zipOut, folder);
            }
            return;
        }
        ZipEntry zipEntry = new ZipEntry(path + file.getName());
        zipOut.putNextEntry(zipEntry);
        byte[] bytes = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
        zipOut.write(bytes);
    }
}
