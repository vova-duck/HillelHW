package HomeWork8Elementary;

public class ObjectArrayRun {
    public static void main(String[] args) {
        ObjectArray list1 = new ObjectArray();
        ObjectArray list2 = new ObjectArray();


        list1.add("ноль");
        list1.add("один");
        list1.add("два");
        list1.add("три");
        list1.add("четыре");
        ////////////////////
        list2.add("ноль");
        list2.add("один");
        list2.add("два");
        list2.add("три");

        System.out.println(list1.equals(list2));


    }
}
