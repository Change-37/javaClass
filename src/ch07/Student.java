package ch07;

public class Student {

    private int number;
    private String name;
    private static int count;

    public Student() {
    }

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
