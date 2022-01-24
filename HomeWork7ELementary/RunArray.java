package HomeWork7ELementary;

import java.util.Arrays;

public class RunArray {
    public static void main(String[] args) {

        ArrayToArrayList arrayToArrayList = new ArrayToArrayList(5);

        arrayToArrayList.add("Буба");
        arrayToArrayList.add("Пупа");
        arrayToArrayList.add("Лупа");
        arrayToArrayList.add("Биба");
        arrayToArrayList.add("Боба");
        arrayToArrayList.add("Дада");
        arrayToArrayList.print();
        System.out.println();
        arrayToArrayList.add(4,"ЗАТЫЧКА");
        arrayToArrayList.print();
        System.out.println();
        arrayToArrayList.delete(2);
        arrayToArrayList.print();
        System.out.println();
        System.out.println(arrayToArrayList.get(4));
        arrayToArrayList.delete("ЗАТЫЧКА");
        arrayToArrayList.print();
        System.out.println();
        System.out.println(arrayToArrayList.get(8));
        System.out.println(arrayToArrayList.get(3));
        System.out.println(arrayToArrayList.getCount() + " столько элементов");


    }
}

