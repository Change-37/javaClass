package ch15.simpledotcom;

import java.util.ArrayList;

public class SimpleDotComGame {
    public static void main(String[] args) {
        GameHelper gameHelper = new GameHelper();
        SimpleDotCom simpleDotCom = new SimpleDotCom();
        ArrayList<Integer> location = new ArrayList<Integer>();
        location.add(2);
        location.add(3);
        location.add(4);
        simpleDotCom.setLocationCells(location);
//        String guess = gameHelper.gameUserInput("예상 위치를 입력하세요.");
        String result1 = simpleDotCom.checkYourSelf("2");
        String result2 = simpleDotCom.checkYourSelf("2");
        String result3 = simpleDotCom.checkYourSelf("3");
        String result4 = simpleDotCom.checkYourSelf("4");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
