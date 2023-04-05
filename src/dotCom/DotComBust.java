package dotCom;

import java.util.ArrayList;

public class DotComBust {
    private ArrayList<DotCom> dotComs = new ArrayList<>();
    private GameHelper gameHelper = new GameHelper();
    private int numofGes;

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
    private void startPlaying(){
        while(!dotComs.isEmpty()){
            String userGuess = gameHelper.getUserInput("Input your guess!");

            checkUserGuess(userGuess);
        }
        finishGame();
    }
    private void checkUserGuess(String userGuess){
        numofGes++;
        String result = "miss";
        for(DotCom dotcom : dotComs){
            result = dotcom.checkYourself(userGuess);
            if(result.equals("kill")){
                dotComs.remove(dotcom);
                break;
            }
            else if(result.equals("hit")){
                break;
            }
        }
        System.out.println(result);
    }
    private void setUpGame(){
        dotComs.add (new DotCom("google.com"));
        dotComs.add (new DotCom("naver.com"));
        dotComs.add (new DotCom("kakao.com"));

        for(DotCom dotCom : dotComs){
            ArrayList<String> newLocation = gameHelper.placeDotCom();
            dotCom.setLocation(newLocation);
        }
        gameHelper.printAll();
    }
    private void finishGame(){
        System.out.println(numofGes+" Guesses");
    }
}
