package ch12;

public class Student {
    private int number;
    private String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            return this.number == ((Student) obj).number;
        }
        return false;
    }
}
