package HomeWork5Elementary;

public class Main {
    public static void main(String[] args) {
        Student[] students = University.createStudents();
        System.out.println("все студенты");
        for (Student student : students) {
            System.out.println(student);}
        System.out.println("____");
        System.out.println("студенты факультета право");
        for (Student student : students) {
            student.checkFaculty("Право");
        }
        System.out.println("____");
        System.out.println("студенты факультета право и 515 группы");
        for (Student student : students) {
            student.checkFacultyAndGroup("Право", 515);
        }
        System.out.println("____");
        System.out.println("студенты рождены в 2001 году");
        for (Student student : students) {
            student.checkYearOfBirth(2001);
        }
        System.out.println("____");
        System.out.println("студенты 313 группы");
        for (Student student : students) {
            student.checkGroup(313);
        }
        System.out.println("____");

    }
}


