package HomeWork6Elementary;

public class Phone {
    private int id;
    private String surname, name, secondName;
    private String address;
    private int phoneNumber;
    private CreditCart creditCart;
    private int intercityMinutes;
    private int inCityMinutes;
    private int internetTraffic;


    public Phone(){

    }
    public Phone(int id, String surname, String name, String secondName, String address, int phoneNumber, CreditCart creditCart, int intercityMinutes, int inCityMinutes, int internetTraffic) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.creditCart = creditCart;
        this.intercityMinutes = intercityMinutes;
        this.inCityMinutes = inCityMinutes;
        this.internetTraffic = internetTraffic;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CreditCart getCreditCart() {
        return creditCart;
    }

    public void setCreditCart(CreditCart creditCart) {
        this.creditCart = creditCart;
    }

    public int getIntercityMinutes() {
        return intercityMinutes;
    }

    public void setIntercityMinutes(int intercityMinutes) {
        this.intercityMinutes = intercityMinutes;
    }

    public int getInCityMinutes() {
        return inCityMinutes;
    }

    public void setInCityMinutes(int inCityMinutes) {
        this.inCityMinutes = inCityMinutes;
    }

    public int getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(int internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "АйДИ номер =" + id +
                ", Фамилия= '" + surname + '\'' +
                ", Имя= '" + name + '\'' +
                ", Отчество= '" + secondName + '\'' +
                ", Адрес = '" + address + '\'' +
                ", номер телефона " + "+380" + phoneNumber +
                ", Информация по кредитной карте= " + creditCart +
                ", межгородние разговоры= " + intercityMinutes +" минут осталось "+
                ", внутрегородние разговоры = " + inCityMinutes +" минут осталось "+
                ", оставшийся интернет трафик = " + internetTraffic + " MB " +
                '}';
    }
}
