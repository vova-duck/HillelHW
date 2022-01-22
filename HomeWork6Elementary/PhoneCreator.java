package HomeWork6Elementary;


import java.util.*;

public class PhoneCreator {


    public static ArrayList<Phone> createPhone() {
        int numberOfPhones = 10;
        int id;
         String surname, name, secondName;
         String address;
         int phoneNumber;
        CreditCart creditCart;
         int intercityMinutes;
        int inCityMinutes;
       int internetTraffic;
        ArrayList<Phone> phones = new ArrayList<>();
        for (int i = 0; i < numberOfPhones; i++) {
            id = 1000 + i;
            surname = giveSurName();
            name = giveName();
            secondName = giveSecondName();
            address = "Улица Пушкина 22";
            phoneNumber = givePhoneNumber();
            creditCart = CreditCardCreator.createCreditCard();
            intercityMinutes = giveMinutes();
            inCityMinutes = giveMinutes();
            internetTraffic = giveInternetTraffic();


            Phone phone = new Phone(id,surname,name,secondName,address,phoneNumber,creditCart,intercityMinutes,inCityMinutes,internetTraffic);
           phones.add(phone);

        }
        return phones;
    }




    public static String giveName() {
        String[] names = new String[]{"Владимир", "Александр", "Константин", "Олег", "Вильгельм", "Феликс", "Дональд", "Валерий", "Руслан", "Игорь", "Иван", "Пётр", "Тарас", "Николай", "Евгений", "Ярослав", "Виталий", "Василий", "Сергей", "Эдуард", "Юрий"};
        int a = (int) (Math.random() * names.length);
        for (int i = 0; i < names.length; i++) {
            if (i == a) {
                return names[i];
            }

        }
        return null;
    }

    public static String giveSurName() {
        String[] names = new String[]{"Владимиров", "Александров", "Константинов", "Иванов", "Петров", "Тарасов", "Цой", "Шульга", "Яр", "Зубенко"};
        int a = (int) (Math.random() * names.length);
        for (int i = 0; i < names.length; i++) {
            if (i == a) {
                return names[i];
            }

        }
        return null;
    }

    public static String giveSecondName() {
        String[] secondNames = new String[]{"Владимирович", "Александрович", "Константинович", "Олегович", "Вильгельмович", "Феликсович", "Дональдович", "Валеревич", " Русланович", "Игоревич", "Иванович", "Петрович", "Тарасович", "Николевич", "Евгеневич", "Ярославович", "Виталиевич", "Василиевич", "Сергеевич", "Эдуардович", "Юриевич"};
        int a = (int) (Math.random() * secondNames.length);
        for (int i = 0; i < secondNames.length; i++) {
            if (i == a) {
                return secondNames[i];
            }

        }
        return null;
    }

    public static int giveMinutes() {
        return (int) (Math.random() * 16 + 284);
    }

    public static int givePhoneNumber() {
        return (int) (Math.random() * 10_000_000);
    }
    public static int giveInternetTraffic() {
        return (int) (Math.random() * 20_000);
    }


}

