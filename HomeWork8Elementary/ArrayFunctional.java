package HomeWork8Elementary;

import java.util.Collection;

public interface ArrayFunctional {

    public boolean add(Object object);

    public boolean add(int index, Object object);

    public boolean delete(Object object);

    public Object get(int index);

    public boolean contain(Object object);

    public boolean equals(Collection string);

    public boolean clear();

    public void checkAndChangeArraySize();
    public void print();
    public int size();
}
