import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.model.enums.AesKeyStrength;
import net.lingala.zip4j.model.enums.CompressionLevel;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        ZipParameters parameters = new ZipParameters();
        parameters.setCompressionMethod(CompressionMethod.DEFLATE);
        parameters.setCompressionLevel(CompressionLevel.NORMAL);
        parameters.setEncryptFiles(true);
        parameters.setEncryptionMethod(EncryptionMethod.AES);
        parameters.setAesKeyStrength(AesKeyStrength.KEY_STRENGTH_256);

        try {
            String pathOut = "A:\\folder\\subfolder\\";
            String in = "A:\\folder\\";
            File file = new File(in);
            ZipFile zipFile = new ZipFile(pathOut + "archive.zip");
            zipFile.setPassword("12345".toCharArray());
            zipFile.addFolder(file, parameters);

            zipFile.extractAll(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
