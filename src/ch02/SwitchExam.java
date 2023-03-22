package ch02;

// 월과 일
public class SwitchExam {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day;

        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
            case 2:
                day = 28;
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            default:
                System.out.println("Not a Month");
                return;
        }
        System.out.println(args[0] + "th month has " + day + " days");
    }
}
