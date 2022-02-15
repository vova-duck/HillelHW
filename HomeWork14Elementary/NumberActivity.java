import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberActivity {


    public static int[] intArray() throws IOException {
        System.out.println("введите циферки, не буковки");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numbers = br.readLine();

        if (isDigit(numbers)) {
            String[] arrayNumbers = numbers.split("");
            int[] numbersFromConsole = new int[numbers.length()];

            for (int i = 0; i < arrayNumbers.length; i++) {
                numbersFromConsole[i] = Integer.parseInt(arrayNumbers[i]);

            }
            return numbersFromConsole;
        } else System.out.println("Строка не циферки, обмануть решил?)");
        return intArray();
    }


    public static boolean isDigit(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
