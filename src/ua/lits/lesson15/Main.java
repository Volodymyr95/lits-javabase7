package ua.lits.lesson15;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class Main {
  public static void main(String[] args) {
    //
    //    try {
    //      int a[] = {1,2,34,5};
    //      System.out.println(a[9]);
    //    } catch (ArrayIndexOutOfBoundsException e) {
    //      System.out.println(e);
    //    }

    //    PrintWriter p = null;
    //
    //    try {
    //      p = new PrintWriter("list.lesson15.txt");
    //      p.println("Out 15 lesson");
    //    } catch (FileNotFoundException e) {
    //      System.out.println(e);
    //    }

    //    System.out.println("let's do something important");

    //    try {
    //      int a[] = {1,2,34,5};
    //      System.out.println(a[9]);
    //    } catch (ArithmeticException | ArrayIndexOutOfBoundsException  e) {
    //      System.out.println("ArithmeticException | ArrayIndexOutOfBoundsException: " + e);
    //    }
    //    catch (RuntimeException e) {
    //      System.out.println("RuntimeException: " + e);
    //    } catch (Exception e) {
    //      System.out.println("Exception: " + e);
    //    }

    //    try {
    //      int b;
    //      try {
    //        int a[] = {1,2,34,5};
    //        b = a[10];
    //      } catch (ArrayIndexOutOfBoundsException e) {
    //        System.out.println("problem with getting item b");
    //        b = 10;
    //      }
    //
    //      try {
    //        double c = b / 0;
    //        System.out.println("c = " + c);
    //      } catch (ArithmeticException e) {
    //        System.out.println("can not do divide");
    //      }
    //
    //    } catch (Exception e) {
    //      System.out.println("Our main handler");
    //
    //      try {
    //        int i = 10/0;
    //
    //      }catch (ArithmeticException e1) {
    //        System.out.println(e1);
    //      }
    //    }
    //
    //    System.out.println("normal flow ");

    //    try {
    //      int i = 10/0;
    //      System.out.println("normal flow");
    //    } catch (ArithmeticException e) {
    //      System.out.println("ArithmeticException: " + e);
    //    } finally {
    //      System.out.println("Finally block");
    //    }
    //    try {
    //      throw new IOException("can not write to file");
    //    } catch (IOException e) {
    //      System.out.println("Let's handle our first exception");
    //    }
//    One one = new One();
//    one.print();
//    one = null;
//    System.gc();
//    Main m = new Main();
//    m.run();
//    System.out.println("rest of our code");

    UserRepository userRepository = new UserRepository();
    User one = null;
    try {
      one = userRepository.findById("1");
    } catch (EntityNotFoundException e) {
      System.out.println(e);
    }
    System.out.println(one.toString());
    User two = null;
    try {
      two = userRepository.findById("2");
    } catch (EntityNotFoundException e) {
      System.out.println(e);
    }
    System.out.println(two);
    try {
      userRepository.findById("10");
    } catch (EntityNotFoundException e) {
      System.out.println(e);
    }
  }

  public void run() {
    try {
      print();
    } catch (IOException e) {
      System.out.println("IOException: " + e);
    }
  }

  public void print() throws IOException {
    toFile();
  }

  public void toFile() throws IOException {
    throw new IOException("can not write to file");
  }
}
