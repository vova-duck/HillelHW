package HomeWork4Elementary;

import HomeWork2Elementary.NumberReceiver;

import java.io.IOException;

public class OdesaToKyiv {
    public static void main(String[] args) throws IOException {
        double price = (Double.parseDouble(args[0] ) );
        countAndPrintWatOdesaKyiv(price);
    }
    public static void countAndPrintWatOdesaKyiv(double price) throws IOException {
        int tanVolume, gasRemaining, consumption;
        System.out.println("введите объем бака");
        tanVolume = NumberReceiver.dataReceive();
        gasRemaining = (int) ((Math.random() * 48) + 20);
        System.out.println("введите ваш расход топлива");
        consumption = NumberReceiver.dataReceive();
        Car car =new Car(tanVolume,gasRemaining,consumption);
        int distanceOdesaKryveOzero = 178;
        int distanceKryveOzeroZhashkiv = 154;
        int distanceZhashkivKyiv = 148;
        int distanceOdesaKyiv = distanceOdesaKryveOzero + distanceKryveOzeroZhashkiv + distanceZhashkivKyiv;
        for (int i = 0; i <= distanceOdesaKyiv ; i++) {
            if (i == 0){
                System.out.println("Начало пути из Одессы в Киев.");
                car.countFuelRemain(i);
                car.indicateFuel(distanceOdesaKryveOzero);
                System.out.println();
            }
            if (i == distanceOdesaKryveOzero){
                car.countFuelRemain(i);
                car.fullFullTank();
                car.indicateFuel(distanceKryveOzeroZhashkiv);
                System.out.println("Запавка в Кривом Озере. ");
                System.out.println();
            }
            if (i == distanceKryveOzeroZhashkiv + distanceOdesaKryveOzero){
                car.indicateFuel(distanceZhashkivKyiv);
                car.countFuelRemain(distanceKryveOzeroZhashkiv);
                car.fullFullTank();
                System.out.println("Заправка в Жашкове.");
                System.out.println();


            }
            if (i == distanceOdesaKyiv){
                car.indicateFuel(i);
                car.countFuelRemain(distanceZhashkivKyiv);
                System.out.println("Прибытие в Киев.");
                System.out.println();
            }

        }
        double sum = price * (car.getWHOLECONSUMPTION() - gasRemaining );

        System.out.println((car.getWHOLECONSUMPTION() ) + "потрачено всего бензина.");
        System.out.println(sum + "цена полной поездки");
    }
}
