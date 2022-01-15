package HomeWork5Elementary;

import java.util.ArrayList;

public class University {


    public static void main(String[] args) {
        Student[] students = new Student[10];
        for (int i = 0; i < students.length; i++) {
            students = createStudent().toArray(new Student[i]);
        }



            System.out.println("Студенты факультета Право");
            for (int i = 0; i < students.length -1 ; i++) {
                if (students[i].getFaculty().equals("Право")){
                    System.out.println(students[i]);}
            }

            System.out.println();

            System.out.println("Студенты 3 курса факультета Иностранные языки");
            for (int i = 0; i < students.length -1; i++) {
                if(students[i].getFaculty().equals("Иностранные языки")){
                    if (students[i].getCourse() == 3){
                        System.out.println(students[i]);}}
            }
            System.out.println();


            System.out.println("Студенты рождены после 2001 году:");
            for (int i = 0; i < students.length-1; i++) {
                if (students[i].getYear() >= 2001){
                    System.out.println(students[i]);}
            }
            System.out.println();

            System.out.println("Студенты группы 314:");
            for (int i = 0; i < students.length-1; i++) {
                if (students[i].getGroup() == 314){
                    System.out.println(students[i]);}
            }

        }

    public static ArrayList<Student> createStudent() {
        int numberOfStudents = 10;
        String name, surname, secondName;
        int id;
        int year;
        String faculty;
        int group;
        int course;
        int phoneNumber;
        String address;
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < numberOfStudents; i++) {
            name = giveName();
            surname = giveSurName();
            secondName = giveSecondName();
            id = i + 1000;
            year = giveBirthYear();
            faculty = giveFaculty();
            group = giveGroupNumber(giveFacultyNumber(faculty), giveCourseNumber(year));
            course = giveCourseNumber(year);
            phoneNumber = givePhoneNumber();
            address = "Улица Пушкина 22";


            Student student = new Student(name, surname, secondName, id, year, faculty, group, course, phoneNumber, address);
            students.add(student);
        }
        return students;
    }


    public static String giveName() {
        String[] names = new String[]{"Владимир", "Александр", "Константин", "Олег", "Вильгельм", "Феликс", "Дональд", "Валерий", " Руслан", "Игорь", "Иван", "Пётр", "Тарас", "Николай", "Евгений", "Ярослав", "Виталий", "Василий", "Сергей", "Эдуард", "Юрий"};

        for (int i = 0; i < names.length; i++) {
            int a = (int) (Math.random() * names.length);
            if (i == a) {
                return names[i];
            }

        }
        return "Алексей";
    }

    public static String giveSurName() {
        String[] names = new String[]{"Владимров", "Александров", "Константинов", "Иванов", "Петров", "Тарасов", "Цой", "Шульга", "Яр", "Зубенко"};

        for (int i = 0; i < names.length; i++) {
            int a = (int) (Math.random() * names.length);
            if (i == a) {
                return names[i];
            }

        }
        return "Мельник";
    }

    public static String giveSecondName() {
        String[] secondNames = new String[]{"Владимирович", "Александрович", "Константинович", "Олегович", "Вильгельмович", "Феликсович", "Дональдович", "Валеревич", " Русланович", "Игоревич", "Иванович", "Петрович", "Тарасович", "Николевич", "Евгеневич", "Ярославович", "Виталиевич", "Василиевич", "Сергеевич", "Эдуардович", "Юриевич"};

        for (int i = 0; i < secondNames.length; i++) {
            int a = (int) (Math.random() * secondNames.length);
            if (i == a) {
                return secondNames[i];
            }

        }
        return "Алексеевич";
    }

    public static int giveBirthYear() {
        return (int) ((Math.random() * 5) + 2000);
    }

    public static int givePhoneNumber() {
        return (int) (Math.random() * 10000000);
    }

    public static String giveFaculty() {
        String[] faculties = new String[]{"Философия", "Право", "Криминальное право", "Перевозки грузов", "Иностранные языки"};

        for (int i = 0; i < faculties.length; i++) {
            int a = (int) (Math.random() * faculties.length);
            if (i == a) {
                return faculties[i];
            }

        }
        return "Экономика";
    }


    public static int giveFacultyNumber(String faculty) {

        if (faculty.equals("Философический")) {
            return 100;
        }
        if (faculty.equals("Право")) {
            return 200;
        }
        if (faculty.equals("Криминальное право")) {
            return 300;
        }
        if (faculty.equals("Перевозки грузов")) {
            return 400;
        }
        if (faculty.equals("Иностранные языки")) {
            return 500;
        }
        if (faculty.equals("Экономичский")) {
            return 600;
        }

        return 0;
    }

    public static int giveCourseNumber(int year) {
        if (year == 2000) {
            return 1;
        }
        if (year == 2001) {
            return 2;
        }
        if (year == 2002) {
            return 3;
        }
        if (year == 2003) {
            return 4;
        }
        if (year == 2004) {
            return 5;
        }
        if (year == 2005) {
            return 5;
        }
        return 0;
    }

    public static int giveGroupNumber(int facultyNumber, int course) {
        if (course == 1) {
            return 1 + facultyNumber + 10;
        }
        if (course == 2) {
            return 2 + facultyNumber + 10;
        }
        if (course == 3) {
            return 3 + facultyNumber + 10;
        }
        if (course == 4) {
            return 4 + facultyNumber + 10;
        }
        if (course == 5) {
            return 5 + facultyNumber + 10;
        }
        if (course == 6) {
            return 6 + facultyNumber + 10;


        }
        return 0;

    }

}

