package ch13;

public class Bus implements Take {
    private String number;
    private int passengerCnt;
    private int money;

    public Bus(String number) {
        this.number = number;
    }

    @Override
    public void take(int money) {
        this.money += money;
        this.passengerCnt++;
    }

    @Override
    public void showInfo() {
        System.out.println(String.format("%s번 버스의 누적 탑승 승객은 %d명이며, 수입은 %d원입니다.", number, passengerCnt, money));
    }
}
