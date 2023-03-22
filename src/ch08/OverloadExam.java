package ch08;

public class OverloadExam {
    public static void main(String[] args) {
        Add add = new Add();
        System.out.println(add.sum(10, 20));
        System.out.println(add.sum("부산", "오세요"));

    }
}
