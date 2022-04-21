package HomeWork16Elementary;

import HomeWork16Elementary.players.Player;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static HomeWork16Elementary.utils.CheckResult.checkResult;
import static org.junit.jupiter.api.Assertions.*;

class RunRockPaperScissorsTest {


    @Test
    void checkResultTest() throws IOException {
        Player pl = new Player("Vova");
        assertEquals("Компьтер выиграл", checkResult(2,pl));
    }
}