package ch13;

public class Person {
    private String name;
    private int money;
    private boolean transfer;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeSubway(Subway subway) {
        if(this.money < 1300){
            System.out.println("잔액이 부족합니다.");
            return;
        }
        subway.take(1300);
        this.money -= 1300;
        this.transfer = true;
    }

    public void takeBus(Bus bus) {
        int fee = 1500;
        if(this.transfer == true){
            fee = 200;
        }
        if(this.money < fee){
            System.out.println("잔액이 부족합니다.");
            return;
        }
        bus.take(fee);
        this.money -= fee;
        this.transfer = true;
    }

    public void showInfo() {
        System.out.println(String.format("%s님의 잔액은 %d원 입니다.", name, money));
    }

    public void take(Object obj) {
        if(obj instanceof Subway){
            takeSubway((Subway)obj);
        }
        else if(obj instanceof Bus){
            takeBus((Bus)obj);
        }
    }
}
