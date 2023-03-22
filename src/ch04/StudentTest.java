package ch04;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setName("김김김");
        s2.setName("최최최");
        s3.setName("박박박");

        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
    }
}
