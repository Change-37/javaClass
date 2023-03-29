package ch15;

import java.io.*;

public class CharacterStream1 {
    public static void main(String[] args) {
        Reader reader = new InputStreamReader(System.in);
        int a;
        try {
            a = reader.read();
            System.out.println((char)a);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
