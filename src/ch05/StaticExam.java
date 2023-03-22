package ch05;

import ch04.Student;

public class StaticExam {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        //s1.school = "final";

        s1.showInfo();
        s2.showInfo();
        s3.showInfo();    }
}
