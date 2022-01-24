package HomeWork7ELementary;

import java.util.Arrays;
import java.util.Objects;

public class ArrayToArrayList {

    private int count;
    private String[] array;


    public ArrayToArrayList(int length) {
        array = new String[length];
        count = 0;
    }

    public void checkAndChangeArraySize() {
        if (array.length < count + 1) {
            int doubledSize = (array.length * 2);
            String[] array1 = new String[doubledSize];
            System.arraycopy(array, 0, array1, 0, array.length);
            array = array1;
        }
    }

    public void print() {
        for (Object obj : array) {

                System.out.print(obj + " ");
        }
    }

    public boolean add(String string) {
        checkAndChangeArraySize();
        array[count] = string;
        count++;
        return true;

    }

    public boolean add(int index, String string) {
        checkAndChangeArraySize();
        if (index > count) {
            add(string);
        }
        if (index <= count) {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = string;
        }
        count++;
        return true;
    }


    public boolean delete(int index) {

        for (int i = index; i < array.length-1; i++) {
            array[i - 1] = array[i];
            array[i] = null;
        }
        count--;
        return true;

    }

    public boolean delete(String string) {
        for (int i = 0; i < array.length - 1; i++) {
            if (Objects.equals(array[i], string)) {
                delete(i +1);
            }
        }
        return true;
    }

    public String get(int index) {
        if (index > count) {
            return "в коробочке " + index +" ничего не лежит, нечего тут шастать";
        }
        return "в этой коробочке лежит " + array[index];
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "ArrayToArrayList{" +
                "count=" + count +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}

