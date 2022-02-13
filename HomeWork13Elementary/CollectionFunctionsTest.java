package HomeWork13Elementary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectionFunctionsTest {

    @Test
    void listsAverage() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        assertEquals(6,CollectionFunctions.listsAverage(integerList));
    }

    @Test
    void toUpperCase() {
        List<String> strings = new ArrayList<>();
        List<Pair> pairs = new ArrayList<>();
        strings.add("красный");
        Pair pair = new Pair("красный");
        pairs.add(pair);

        assertEquals(pairs.toString(),CollectionFunctions.toUpperCase(strings).toString());
    }

    @Test
    void filterStringByLengthAndCase() {
        List<String> strings = new ArrayList<>();
        strings.add("Красный");
        strings.add("БАЛИ");
        strings.add("vova");
        strings.add("баклаЖAан");
        strings.add("five");
        assertEquals("[vova, five]",CollectionFunctions.FilterStringByLengthAndCase(strings).toString());
    }
}