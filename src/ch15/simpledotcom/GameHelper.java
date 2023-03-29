package ch15.simpledotcom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

public class GameHelper {
    public String gameUserInput(String prompt) {
        System.out.println(prompt+" ");
        String writeLine = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            writeLine = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return writeLine;
    }
}
