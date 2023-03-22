package ch09;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("grey", "kia", "k5");
        Car car2 = new Car("brown", "kia", "morning");

        car2.showInfo();

        Taxi taxi1 = new Taxi("orange", "hyundai", "sonata");

        taxi1.meterOn();
    }
}
