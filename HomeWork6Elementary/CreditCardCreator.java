package HomeWork6Elementary;

import java.util.Arrays;

public class CreditCardCreator {
    public static void main(String[] args) {
      CreditCart creditCart = createCreditCard();
        CreditCart creditCart1 = createCreditCard();
        CreditCart creditCart2 = createCreditCard();
        CreditCart creditCart3 = createCreditCard();
        CreditCart creditCart4 = createCreditCard();
        System.out.println(creditCart);
        System.out.println(creditCart);
        System.out.println(creditCart);
        System.out.println(creditCart);





    }
    public static CreditCart createCreditCard() {
        String number;
        float debit;
        float credit;
        float AvailableBalance;
           number = Arrays.toString(giveNumber());
            debit = giveDebit();
            credit = giveCredit();
           AvailableBalance = credit + debit;

        return new CreditCart(number, debit, credit, AvailableBalance);
        }


    public static int[] giveNumber() {
        int[] numbers = new int[4];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 8999 + 1000);
            }
return numbers;

        }
    public static float giveDebit() {

        return (float) (Math.random() * 9999);
        }
    public static float giveCredit() {

        return (float) (Math.random() * 9999);
    }
}


