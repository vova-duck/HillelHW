package HomeWork16Elementary;

import HomeWork16Elementary.players.Computer;
import HomeWork16Elementary.players.Player;
import HomeWork16Elementary.utils.Board;
import HomeWork16Elementary.utils.CheckPath;
import HomeWork16Elementary.utils.Helper;
import HomeWork16Elementary.utils.Winner;
import jdk.internal.module.ModuleInfoExtender;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import static HomeWork16Elementary.utils.CheckPath.checkPath;
import static HomeWork16Elementary.utils.CheckResult.checkResult;
import static HomeWork16Elementary.utils.PlayGame.playGame;

public class RunRockPaperScissors {

    public static void main(String [] args) throws IOException {
        System.out.println("Добрый день, введите ваше имя");
        Player pl = new Player(Helper.getString());
        Computer computer = new Computer();
        String line = "";
        System.out.println("Введите желаемое количество игр: ");
        int gameNumber = Helper.getNumber();

        while (!line.equalsIgnoreCase("С")) {
            System.out.println("Для старта игры нажмите [С] или [В] для выхода");
            line = Helper.getString();
            if (line.equalsIgnoreCase("X")) System.exit(-1);
        }

        boolean nextGame = true;

        while (nextGame && 0 != gameNumber) {

          int gameResult =  playGame();

            System.out.println(checkResult(gameResult, pl));

            System.out.println("играем дальше? [Д] / [Н]");
            line = Helper.getString();
            if (line.equalsIgnoreCase("Н"))

                nextGame = false;

            gameNumber--;

        }
        String str = Winner.checkWinner(pl);
        pl.setScore(((float) pl.getWin()/pl.getLost()));
        System.out.println(pl);
        System.out.println("Выберите папку, где хотите сохранить результаты игры.");
        String path = Helper.getString()+"/result.txt";
        while (!checkPath(path)){
            System.out.println("не верный путь");
            path = Helper.getString()+"/result.txt";
        }
        OutputStream output = new FileOutputStream(path, false);
        if (!Files.exists(Path.of(path))){
            Path path1 = Files.createFile(Path.of(path));
        }else {

            output.write(" \n ".getBytes(StandardCharsets.UTF_8));
            output.write(pl.toString().getBytes(StandardCharsets.UTF_8));
            output.write(" \n ".getBytes(StandardCharsets.UTF_8));
            output.write(str.getBytes(StandardCharsets.UTF_8));

        }
    }
}

