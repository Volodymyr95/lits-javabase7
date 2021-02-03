package ua.lits.lesson16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleMain {
    public static void main(String args[]) throws IOException {
        InputStreamReader cin = null;
        FileOutputStream out = null;

        try {
            out = new FileOutputStream("output.txt");
            cin = new InputStreamReader(System.in);
            System.out.println("Enter characters, 'q' to quit.");
            char c = 0;
            do {
                out.write(c);
                c = (char) cin.read();
                System.out.print(c);
            } while(c != 'q');
        }finally {
            if (cin != null) {
                cin.close();
            }
        }
    }
}
