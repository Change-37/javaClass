package ch10;

public class MyShip extends Ship{
    @Override
    public int maxPassengers() {
        return 10;
    }

    @Override
    public int maxLuggage() {
        return 100;
    }
    private String name;

    public MyShip(String name) {
        this.name = name;
    }
}
