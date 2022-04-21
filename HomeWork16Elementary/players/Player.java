package HomeWork16Elementary.players;

import HomeWork16Elementary.utils.Helper;

import java.io.IOException;

public class Player {
   private String name;
    private int win;
    private int lost;
    private float score;

public Player(String name){
    this.name = name;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public static int giveHand() throws IOException {
        System.out.println("камень, ножницы или бумага");
    String hand = Helper.getString();
    int handNum;
    switch (hand){
        case "камень":
            handNum = 0;
        break;

        case "ножницы":
            handNum = 1;
            break;

        case "бумага":
            handNum = 2;
            break;
        default:
            throw new IllegalStateException("Unexpected value: " + hand);
    }
    return handNum;
    }
    public static String givePlayerHand(int pcHand) throws IOException {

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
                throw new IllegalStateException(" не верный ввод, повторите");

        }
        return hand;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", win=" + win +
                ", lost=" + lost +
                ", score=" + score +
                '}';
    }
}
