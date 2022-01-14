package HomeWork4Elementary;

public class Car {
public static double WHOLECONSUMPTION;
    double tankVolume;
    double gasRemaining;
    double consumption;

    public Car(){

    }
    public Car(double tankVolume,double gasRemaining, double consumption){

        this.tankVolume = tankVolume;
        this.gasRemaining = gasRemaining;
        this.consumption = consumption;
    }

    public double fullFullTank(){
        System.out.println("бак заправлен на " + (tankVolume - gasRemaining) + " л." );
WHOLECONSUMPTION += tankVolume - gasRemaining;

return gasRemaining = tankVolume;
    }
    public  double countFuelRemain(int way){
        if (way * consumption / 100 >= gasRemaining) {
            System.out.println("Топлива не достаточно, заправьтесь.");
            fullFullTank();
            gasRemaining -= way * consumption / 100;
            return gasRemaining;
        }
            System.out.println("После преодоления  " + way + " километров остаток бензина составляет " + (gasRemaining -= way * consumption / 100)+ "л.");

        return gasRemaining;

    }
    public  double indicateFuel (int way ){
        if (way * consumption / 100 <= gasRemaining){
            System.out.println(" Достаточно топлива, всего в баке " + gasRemaining);
            return 0;
        }
        else
        System.out.println("Для преодоления пути нужно "+ ((way * consumption / 100) - gasRemaining) +"л. топлива.");
        return((way * consumption / 100) - gasRemaining);

    }
    public double getWHOLECONSUMPTION(){
        return WHOLECONSUMPTION;
    }


}
