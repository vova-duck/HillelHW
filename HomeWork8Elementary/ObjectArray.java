package HomeWork8Elementary;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class ObjectArray implements ArrayFunctional{
    private int count;
    private Object[] arrayListCustom;

    public ObjectArray(int length) {
       arrayListCustom = new Object[length];
        this.count = 0;
    }

    @Override
    public boolean add(Object object) {
        checkAndChangeArraySize();
        arrayListCustom[count] = object;
        count++;
        return false;
    }

    @Override
    public boolean add(int index, Object object) {
        checkAndChangeArraySize();
        if (index > count) {
            add(object);
        }
        if (index <= count) {
            for (int i = arrayListCustom.length - 1; i > index; i--) {
                arrayListCustom[i] = arrayListCustom[i - 1];
            }
            arrayListCustom[index] = object;
        }
        count++;
        return false;
    }

    @Override
    public boolean delete(Object object) {
        for (int i = 0; i < arrayListCustom.length - 1; i++) {
            if (Objects.equals(arrayListCustom[i], object)) {
                delete(i + 1);

            }
        }
        return false;
    }

    @Override
    public Object get(int index) {
        for (int i = index; i < arrayListCustom.length-1; i++) {
            arrayListCustom[i - 1] = arrayListCustom[i];
            arrayListCustom[i] = null;
        }
        count--;
        return null;
    }

    @Override
    public boolean contain(Object object) {
        for (int i = 0; i < count; i++) {
            if (object.equals(arrayListCustom[i])) {
                return true;
            }
        }
            return false;
        }

    @Override
    public boolean equals(Collection string) {
        if (string == this) {
            return true;
        }
        if (this.getClass() != string.getClass()) {
            return false;
        }
        ObjectArray customArrayList = (ObjectArray) string;
        return this.count == customArrayList.count && Arrays.equals(this.arrayListCustom, customArrayList.arrayListCustom);

    }


    @Override
    public boolean clear() {
        arrayListCustom = new ObjectArray[10];
        this.count = 0;
        return true;
    }

    private void checkAndChangeArraySize() {
        if (arrayListCustom.length < count + 1) {
            int doubledSize = (arrayListCustom.length * 2);
            String[] array1 = new String[doubledSize];
            System.arraycopy(arrayListCustom, 0, array1, 0, arrayListCustom.length);
            arrayListCustom = array1;
        }

    }

    @Override
    public void print() {
            for (Object obj : arrayListCustom) {

                System.out.print(obj + " ");
        }
    }

    @Override
    public int size() {
        return count;
    }
}
