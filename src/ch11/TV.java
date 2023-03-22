package ch11;

public class TV implements Sound{
    private int soundLevel;
    @Override
    public void soundUp() {
        soundLevel++;
    }

    @Override
    public void soundDown() {
        soundLevel--;
    }

    public void showInfo(){
        System.out.println("current Sound Level: " + soundLevel);
    }
}
