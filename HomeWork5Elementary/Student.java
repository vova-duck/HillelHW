package HomeWork5Elementary;

public class Student {
    String name, surname, secondName;
    private int id;
   public int year;
    String faculty;
    int group;
    int course;
    int phoneNumber;
    String address;

    public Student(){

    }
    public  Student(String name, String surname,String secondName, int id, int year, String faculty, int group, int course, int phoneNumber, String address){
        this.name = name;
        this.surname = surname;
        this.secondName =secondName;
        this.id = id;
        this.year = year;
        this.faculty = faculty;
        this.group = group;
        this.course = course;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String toString (){
        return this.surname + " " + this.name + " " + this.secondName +" " +this.year + " года рождения" + " студент факультета " + this.faculty + " в группе № " +
                this.group + " на " +this.course + " курсе. " + " Личная информация #" + this.id + " номер телефона +380" +this.phoneNumber +
                " адрес " + this.address;


    }
}
