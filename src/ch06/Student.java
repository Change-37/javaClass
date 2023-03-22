package ch06;

public class Student {
    private String name;
    private int number;
    private String group;

    Student(String name, int num) {
        this.name = name;
        this.number = num;
    }
    Student(int num, String name) {
        this.name = name;
        this.number = num;
    }
    Student() {}

    public void showInfo() {
        System.out.println("이름은 " + name + "입니다.");
        System.out.println("학번은 " + number + "입니다.");
    }
}
