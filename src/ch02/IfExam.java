package ch02;

public class IfExam {
    public static void main(String[] args) {
        int n = args.length;
        if (n == 0) {
            System.out.println("plz input something");
        } else if (n == 1){
            System.out.print("you input " + args[0]);
        } else if (n == 2) {
            System.out.println("you input "+ args[0] +", "+args[1]);
        } else {
            System.out.println("input is too long");
        }
    }
}
