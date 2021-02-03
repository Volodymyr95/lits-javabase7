package ua.lits.lesson16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedMain {
    public static void main(String[] args)   {

        try(BufferedReader br = new BufferedReader(new FileReader("input.txt"))){
            String s = "";
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        }catch(IOException e) {

        }
    }
}
