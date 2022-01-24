package HomeWork8Elementary;

public class ObjectArrayRun {
    public static void main(String[] args) {
        ObjectArray list1 = new ObjectArray(6);
        ObjectArray list2= new ObjectArray(5);
        ObjectArray list3 = new ObjectArray(3);
        list1.add("Бибип");
        list1.add("мибип");
        list1.add("ибип");
        list1.add("Биибип");
        list1.add("Биимбип");
        list1.add("Бибиимвп");
        list1.print();
        list2 = list1;
        list1.equals(list2);
        for (int i = 0; i < list3.size(); i++) {
           list3.add("java" + i);
        }
        list3.print();
        list3.equals(list2);
        list3.add(2, "javaScript");
        list3.print();
        list3.delete("JavaSkript");
        list3.print();



    }
}
