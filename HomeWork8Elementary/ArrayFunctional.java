package HomeWork8Elementary;

import java.util.Collection;

public interface ArrayFunctional {

    public boolean add(Object object);

    public boolean add(int index, Object object);

    public boolean delete(Object object);

    public Object get(int index);

    public boolean contain(Object object);

    public boolean equals(ObjectArray objectArray);

    public boolean clear();

    public void print();
    public int size();

}
