package ua.lits.lesson16;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOMain {


    public static void main(String[] args) {

        try (FileReader in = new FileReader(new File("test.txt"));
             FileWriter out = new FileWriter("output.txt")) {
            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
                out.write(c);
            }
        } catch (IOException e) {

        }
    }
}
