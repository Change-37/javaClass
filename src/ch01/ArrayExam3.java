package ch01;

public class ArrayExam3 {
    public static void main(String[] args) {

        int a[];
        int[] b;
        int[] c = {23, 45, 13};

        a = new int[4];
        b = new int[]{21, 22, 23, 24};
        c = b;

        System.out.println(a.length);
        System.out.println(b.length);
        System.out.println(c.length);
    }
}
