package HomeWork16Elementary.players;

import HomeWork16Elementary.utils.Helper;

import java.io.IOException;

public class Computer {
    private String name;


    public Computer (){
this.name = "Al Pacho";
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String givePcHand(int pcHand) throws IOException {
        String hand;
        switch (pcHand){
            case 0:
                hand = "камень";
                break;

            case 1:
                hand = "ножницы";
                break;

            case 2:
                hand = "бумага";
                break;
            default:
                throw new IllegalStateException("Unexpected value: ");
        }
        return hand;
    }

    public static int giveComputerHand(){
        return Helper.getRandomNumber(0,3);
    }
}
