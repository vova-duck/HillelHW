package HomeWork16Elementary.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Helper {
    public  static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String getString() throws IOException {
        String string = reader.readLine();
        return string;
    }
    public static int getNumber() throws IOException{
        int number = Integer.parseInt(reader.readLine());
        return number;
    }
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
