package ch05;

public class Student {
    private String name;
    private int number;
    private String group;
    final static String school = "부산소프트웨어마이스터고등학교";

    public void study(){
        System.out.println("Studying");
    }
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
    public void showInfo(){
        System.out.println("이름은 "+name+"입니다.");
        System.out.println("학교는 "+school+"입니다.");
    }

    public int getNumber() {
        return number;
    }
    public String getGroup() {
        return group;
    }
    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public void setName(String name) {
        this.name = name;
    }
}
