package HW16.savers;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class YtoJsaver {

    public static void saver(String str, String path) throws IOException {
        OutputStream output = new FileOutputStream(path, true);
        if (!(Files.exists(Path.of(path)))) {
            Path file  = Files.createFile(Path.of(path));
        } else {
            output.write(str.getBytes(StandardCharsets.UTF_8));
        }
    }
}
