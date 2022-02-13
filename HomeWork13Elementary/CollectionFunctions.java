package HomeWork13Elementary;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionFunctions {
    public static Double listsAverage(List<Integer> integerList){
       return  integerList.stream().mapToInt(l -> l).average().orElse(Double.NaN);

    }
    public static List<Pair> toUpperCase(List<String> strings) {
       List<Pair>pairList = new ArrayList<>();
        strings.stream().forEach(str -> pairList.add(new Pair(str)));
        return  pairList;
    }
    public static List<String> FilterStringByLengthAndCase(List<String> strings) {
        Predicate<String> isLowerCase = str -> str.equals(str.toLowerCase());
        Predicate<String> isFourSymbols = str -> (str.length() == 4);

        return strings.stream()
                .filter(isLowerCase.and(isFourSymbols))
                .collect(Collectors.toList());
    }

}
