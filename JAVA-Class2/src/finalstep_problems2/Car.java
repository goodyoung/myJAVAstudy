package finalstep_problems2;

public class Car {
    private static int carSerialNum = 10000;
    int carNum;
    public Car(){
        carNum = ++carSerialNum;
    }

    public int getCarNum() {
        return carNum;
    }
}
