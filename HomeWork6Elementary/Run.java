package HomeWork6Elementary;

import java.io.IOException;
import java.util.ArrayList;

public class Run {
    public static void main(String[] args) throws IOException {
        ArrayList<Phone> phones = PhoneCreator.createPhone();
        System.out.println("Оригинальный список.");
        for (Phone phone : phones) {
            System.out.println(phone);
            System.out.println("_____________________________________");

        }

       new FunctionalImpl().sortToAlphabet(phones);
       new FunctionalImpl().sortMostSpentInternet(phones);
        new FunctionalImpl().showWhoUsedInCityCalls(phones);
        new FunctionalImpl().showWhoUsedIntercityCalls(phones);




    }
}
