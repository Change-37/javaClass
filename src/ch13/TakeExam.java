package ch13;

public class TakeExam {
    public static void main(String[] args) {
        // 1. 대중교통 객체 생성
        Person choi = new Person("choi", 5000);
        Subway brown = new Subway(3);
        Bus bus7_2 = new Bus("7-2");

        // 2. 대중교통 이용
        //choi.takeSubway(brown);
        //choi.takeBus(bus7_2);
        choi.take(brown);
        choi.take(bus7_2);
        choi.showInfo();
        brown.showInfo();
        bus7_2.showInfo();


        Person park = new Person("park", 5000);
    }
}
