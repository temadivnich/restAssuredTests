package snooker.api;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class FileUtils {

    public static File createFile(InputStream is, String fileName) throws Exception {
        File output = new File(fileName);
        FileOutputStream fos = new FileOutputStream(output);

        int read = 0;
        byte[] buffer = new byte[8 * 1024];
        while ((read = is.read(buffer)) != -1) {
            fos.write(buffer, 0, read);
            fos.flush();
        }
        fos.close();
        return output;
    }
}
