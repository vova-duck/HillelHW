package HomeWork16Elementary;

import HomeWork16Elementary.utils.Helper;

public class Test {
    public static void main(String[] args) {
        int test ;
        int count = 0;
        while (count != 100){

            test = Helper.getRandomNumber(0,3);
            System.out.println(test);
            count++;
        }
    }
}
