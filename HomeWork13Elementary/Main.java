package HomeWork13Elementary;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(67);
        numbers.add(17);
        numbers.add(1);
        numbers.add(122);
        // Имеется коллекция из Integers, использую стримы посчитать среденее значения всех чисел
        System.out.println(CollectionFunctions.listsAverage(numbers));
        List<String> strings = new ArrayList<>();
        strings.add("Красный");
        strings.add("Белый");
        strings.add("красивый");
        strings.add("баклаЖAан");
        strings.add("вова");
        strings.add("Вова");
        strings.add("пять");
        //Имеется коллекция из String, привести все стринги в UPPERCASE и вернуть коллекцию List<Pair>
        //
        //in: "one", "two", ...
        //
        //out: {"one":"ONE"}, {"two", "TWO"}, ..
        System.out.println(CollectionFunctions.toUpperCase(strings));
        //Имеется коллекция из String, отфильтровать и вывести на экран все значения, которые написаны в loverCase and length = 4
        System.out.println(CollectionFunctions.FilterStringByLengthAndCase(strings));



    }
}

