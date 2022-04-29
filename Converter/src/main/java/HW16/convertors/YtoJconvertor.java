package HW16.convertors;

import HW16.cprocessor.ConvertToJson;
import HW16.savers.YtoJsaver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class YtoJconvertor {

    public static void convert2json(String path2file, String path4file) throws IOException {
        String str = Files.readString(Path.of(path2file));
        String string = ConvertToJson.convertYamlToJson(str);
        YtoJsaver.saver(string, path4file);
    }
}
