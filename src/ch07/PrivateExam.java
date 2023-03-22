package ch07;

public class PrivateExam {
    public static void main(String[] args) {
        Student s1 = new Student(123, "최최최");
        Student s2 = new Student(123, "최최최");
        Student s3 = new Student(123, "최최최");

        System.out.println(Student.getCount());
    }
}
