package dotCom;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DotCom {
    String name;
    ArrayList<String> locations;
    public DotCom(String name) {
        this.name = name;
    }
    public String checkYourself(String guess){
        String result = "Miss";
        int index = locations.indexOf(guess);
        if(index >= 0){
            locations.remove(index);
            result = "Hit";
            if(locations.isEmpty()) result = "Kill";
        }
        return result;
    }
    public void setLocation(ArrayList<String> newLocations){
        this.locations = newLocations;
    }
}
