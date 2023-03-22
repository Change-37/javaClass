package ch09;

public class Car {
    private String color;
    private String company;
    private String model;
    protected int speed;
    private char gear;

    public Car(String color, String company, String model) {
        this.color = color;
        this.company = company;
        this.model = model;
        this.gear = 'D';
    }

    public void startCar(){
        this.gear = 'D';
        System.out.println("car started");
        speedUp();
    }
    public void stopCar(){
        while (speed >= 0){
            speedDown();
        }
        this.gear = 'P';
        System.out.println("car stopped");
    }
    public void speedUp(){
        if(speed >= 250){
            System.out.println("too fast");
        }
        if(gear != 'D'){
            System.out.println("not on a driving");
            return;
        }
        System.out.println("car speed up");
        speed += 10;
    }
    public void speedDown(){
        if(gear != 'D'){
            System.out.println("car already stopped");
            return;
        }
        System.out.println("car speed down");
        speed -= 10;

    }
    public void showInfo(){
        System.out.println("this car is \"" + model + "\" with " + color + " color from " + company);
    }

    public char getGear() {
        return gear;
    }
}
