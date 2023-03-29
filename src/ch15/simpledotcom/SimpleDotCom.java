package ch15.simpledotcom;

import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<Integer> board;
    private int count;
    public void setLocationCells(ArrayList<Integer> location){
        this.board = location;
    }

//    public String checkYourSelf(String guess){
//        int gnu = Integer.parseInt(guess);
//        String result = "Miss";
//        for(int i : board){
//            if(i == gnu){
//                result = "Hit";
//                count++;
//                break;
//            }
//        }
//        if(count == board.length) result = "Kill";
//        return result;
//    }

    public String checkYourSelf(String guess){
        int gnu = Integer.parseInt(guess);
        String result = "Miss";
        int index = board.indexOf(gnu);
        if(index >= 0){
            board.remove(index);
            result = "Hit";
            if(board.isEmpty()) result = "Kill";
        }

        return result;
    }
}
