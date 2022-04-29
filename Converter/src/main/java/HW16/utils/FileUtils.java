package HW16.utils;

import HW16.convertors.JtoYconvertor;
import HW16.convertors.YtoJconvertor;

import java.io.*;
import java.nio.file.Path;

public class FileUtils {

    public static boolean check(double number) {
        if ((number % 1) == 0 && number > 0 && number <= 2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkIn(String str) {
        if (Path.of(str).isAbsolute()) {
            return true;
        } else {
            return false;
        }
    }

    public static void answers(int number, String path2file, String path4file) throws IOException {
        if (number == 1){
            path4file = path4file + "/jsonToyaml.yaml";
            JtoYconvertor.convert2yaml(path2file, path4file);
        } else if (number ==2 ){
            path4file = path4file + "/yamlTojson.json";
            YtoJconvertor.convert2json(path2file, path4file);
        } else {
            System.out.println("Something went wrong. Try again.");
        }
    }
}