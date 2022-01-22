package HomeWork6Elementary;

import java.util.Random;

public class CreditCart {
    private String number;
    private float debit;
    private float credit;
    private float availableMoney;

    public CreditCart(){

    }
    public CreditCart(String number, float debit, float credit, float availableMoney){
        this.number = number;
        this.debit =debit;
        this.credit = credit;
        this.availableMoney = availableMoney;

    }

    public float getDebit() {
        return debit;
    }

    public void setDebit(float debit) {
        this.debit = debit;
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    public float getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(float availableMoney) {
        this.availableMoney = availableMoney;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "CreditCart{" +
                "Номер кредитной карты= " + number +
                ", Дебетовые средтва= " + debit +
                ", Кредитные средства= " + credit +
                ", Баланс аккаунта= " + availableMoney +
                '}';
    }
}
