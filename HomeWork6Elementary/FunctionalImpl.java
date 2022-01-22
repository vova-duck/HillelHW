package HomeWork6Elementary;

import HomeWork2Elementary.NumberReceiver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Comparator.*;
import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

public class FunctionalImpl implements Functional {
    @Override
    public void sortToAlphabet(ArrayList<Phone> phones) {
        phones.sort(new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("_______________________Отсортированные пользователи по алфавиту_______________________");
        for (Phone phone : phones) {
            System.out.println(phone);
            System.out.println("______________________________________________________________________________________________");

        }
    }

    @Override
    public void sortMostSpentInternet(ArrayList<Phone> phones) {
     Collections.sort(phones, new Comparator<Phone>() {
         @Override
         public int compare(Phone o1, Phone o2) {
             return -(o1.getInternetTraffic() - o2.getInternetTraffic());
         }
     });
        System.out.println("_______________________Отсортированные по бОльшему остатку интернет трафика_______________________");
        for (Phone phone : phones) {
            System.out.println(phone);
            System.out.println("______________________________________________________________________________________________");
    }
        }


    @Override
    public void showWhoUsedIntercityCalls(ArrayList<Phone> phones) {
       int fullMinutes = 300;
        System.out.println("_______________________пользователи, которые звонили по межгороду_______________________");
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getIntercityMinutes() < fullMinutes) {
                System.out.println(phones.get(i));
                System.out.println("______________________________________________________________________________________________");
            }

        }
    }

    @Override
    public void showWhoUsedInCityCalls(ArrayList<Phone> phones) throws IOException {
       int fullMinutes = 300;
       int presetMinutes = 50;
        System.out.println("_______________________Пользователи, которые потратели больше " + presetMinutes + " минут_______________________");
        for (int i = 0; i < phones.size(); i++) {
            if (fullMinutes - phones.get(i).getIntercityMinutes() > presetMinutes) {
                System.out.println(phones.get(i));
                System.out.println("______________________________________________________________________________________________");
            }

        }


    }
}
