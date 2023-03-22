package ch09;

public class Taxi extends Car{
    private int meter;

    public Taxi(String color, String company, String model) {
        super(color, company, model);
    }

    public void meterOn(){
        System.out.println("meter on");
        startCar();
        speed += 20;
    }
    public void meterOff(){
        System.out.println("meter off");
    }

    @Override
    public void stopCar() {
        super.stopCar();
        meterOff();
    }
}
