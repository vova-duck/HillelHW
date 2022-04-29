package HW16.convertors;

import HW16.cprocessor.ConvertToYaml;
import HW16.savers.JtoYsaver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class JtoYconvertor {
    public static void convert2yaml(String path2file, String path4file) throws IOException {
        String str = Files.readString(Path.of(path2file));
        str = ConvertToYaml.convertYamlToJson(str);
        JtoYsaver.saver(str, path4file);
    }
}
