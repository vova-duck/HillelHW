package HomeWork16Elementary.utils;

import HomeWork16Elementary.players.Computer;
import HomeWork16Elementary.players.Player;

import java.io.IOException;

public class PlayGame {
    public static int playGame() throws IOException {
        int [][] board = Board.giveBoard();
        int computerHand = Computer.giveComputerHand();
        int playerHand = Player.giveHand();
        System.out.println("игрок выбросил :" + Player.givePlayerHand(playerHand) + ", компьтер выбросил :" + Computer.givePcHand(computerHand));
        return board[playerHand][computerHand];
    }
}
