package HomeWork8Elementary;

import java.util.Objects;

public class ObjectArray implements ArrayFunctional, Iterator{
    private int count;
    private int index;
    private Object[] arrayListCustom;

    public ObjectArray() {
        arrayListCustom = new Object[10];
        this.count = 0;
        this.index = 0;
    }

    public ObjectArray(int length) {
       arrayListCustom = new Object[length];
        this.count = 0;
        this.index = 0;
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
    public boolean delete(int index){
        if (index > count){
            return false;
        }
        for (int i = index; i < arrayListCustom.length- 1; i++) {
          arrayListCustom[i]=   arrayListCustom[i + 1] ;
          arrayListCustom[i + 1]= null;
        }
        count--;
        return true;
    }
    

    @Override
    public boolean delete(Object object) {
        for (int i = 0; i < arrayListCustom.length - 1; i++) {
            if (Objects.equals(arrayListCustom[i], object)) {
                delete(i);
            }
        }
        return false;
    }

    @Override
    public Object get(int index) {
      if (index > count){
          System.out.println("Этот идекс пуст либо его не существует");
      }
      return arrayListCustom[index];
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
    public boolean equals(ObjectArray array) {
        if (count != array.size()){
            return false;
        }
        for (int i = 0; i < count; i++) {
          if ( arrayListCustom[i] != (array.get(i))){
              return false;
          }
        }
        return true;
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
        System.out.print("{ ");
        for (int i = 0; i < count; i++) {
            System.out.print(arrayListCustom[i] + " ");
        }
        System.out.print("}");
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean hasNext() {

        return index < arrayListCustom.length;
    }

    @Override
    public Object next() {
        if (index <= arrayListCustom.length){
            reset();
        }
        return arrayListCustom[index++];
    }

    @Override
    public void reset() {
        count = 0;

    }


}
