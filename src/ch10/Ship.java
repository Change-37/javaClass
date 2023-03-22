package ch10;

public abstract class Ship {
    public abstract int maxPassengers();

    public abstract  int maxLuggage();

    public void showInfo(){
        System.out.println("I am a ship");
    }
}
