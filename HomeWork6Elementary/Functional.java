package HomeWork6Elementary;

import HomeWork6Elementary.Phone;

import java.io.IOException;
import java.util.ArrayList;

public interface Functional {
    public void sortToAlphabet(ArrayList<Phone> phones);
    public void sortMostSpentInternet(ArrayList<Phone> phones);
    public void showWhoUsedIntercityCalls(ArrayList<Phone> phones);
    public void showWhoUsedInCityCalls(ArrayList<Phone> phones) throws IOException;


}
