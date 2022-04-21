package HomeWork16Elementary.utils;

import java.nio.file.Path;

public class CheckPath {

    public static boolean checkPath(String path) {
        if (Path.of(path).isAbsolute()) {
            return true;
        } else return false;
    }
}
