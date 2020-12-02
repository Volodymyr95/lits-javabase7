package ua.lits.lesson3;

import java.util.Random;

public class Main {

  public static void main(String[] args) {
    //    int a = 1;
    //    int b = 2;
    //
    //    if (a > b) {
    //      System.out.println(" а > b");
    //
    //    } else {
    //      System.out.println(" а < b");
    //    }
    //
    //    if ("car".equals("dog")) {
    //      System.out.println("The cat is the same as the dog");
    //    } else {
    //      System.out.println("A cat is not a dog");
    //    }
    //
    //    if ('a' > 'b') {
    //      System.out.println("char comparison was true");
    //    }
    //
    //    int month = 8;
    //
    //    if (month == 1) {
    //      System.out.println("Січень");
    //    } else if (month == 2) {
    //      System.out.println("Лютий");
    //    } else if (month == 6) {
    //      System.out.println("Червень");
    //    } else if (month == 12) {
    //      System.out.println("Грудень");
    //    }
    //
    //    // >, <, >=, <=, !=, ==, object.equals(object2)
    //
    //    if (month == 12 || month == 1 || month == 2) {
    //      System.out.println("Зима");
    //    } else if (month == 3 || month == 4 || month == 5) {
    //      System.out.println("Весна");
    //    } else if (month == 6 || month == 7 || month == 8) {
    //      System.out.println("Літо");
    //    } else if (month == 9 || month == 10 || month == 11) {
    //      System.out.println("Осінь");
    //    }
    //
    //    // || &&
    //
    //    switch (month) {
    //      case 1:
    //        System.out.println("Січень");
    //        break;
    //      case 2:
    //        System.out.println("Лютий");
    //        break;
    //      case 6:
    //        System.out.println("Червень");
    //        break;
    //      default:
    //        System.out.println("невірний місяць");
    //        break;
    //    }
    //
    //    switch (month) {
    //      case 12:
    //      case 1:
    //      case 2:
    //        System.out.println("winter");
    //        break;
    //      case 3:
    //      case 4:
    //      case 5:
    //        System.out.println("spring");
    //        break;
    //      case 6:
    //      case 7:
    //      case 8:
    //        System.out.println("summer");
    //        break;
    //      case 9:
    //      case 10:
    //      case 11:
    //        System.out.println("fall");
    //        break;
    //      default:
    //        System.out.println("wrong month id");
    //    }

    //    Random r = new Random();
    //    for (int i = 0; i < 50; i++) {
    //      int c = r.nextInt(26) + 'a';
    //      switch (c) {
    //        case 'a':
    //        case 'e':
    //        case 'i':
    //        case 'o':
    //        case 'u':
    //        case 'y':
    //        case 'w':
    //          System.out.println(c + " голосна");
    //          break;
    //        default:
    //          System.out.println(c + " приголосна");
    //      }
    //    }
    //    String month = "january";
    //
    //    switch (month) {
    //      case "january":
    //        System.out.println(month + " is 1");
    //        break;
    //      case "february":
    //        System.out.println(month + " is 2");
    //        break;
    //      case "march":
    //        System.out.println(month + " is 3");
    //        break;
    //      case "april":
    //        System.out.println(month + " is 4");
    //        break;
    //      case "may":
    //        System.out.println(month + " is 5");
    //        break;
    //      case "june":
    //        System.out.println(month + " is 6");
    //        break;
    //      default:
    //        System.out.println("We don't know that month");
    //        break;
    //    }

    // code
    ///
    //
    //
    //      if (month.equals("december")) {
    //          //need to buy some presents
    //      }

    //      LOOPS
    //    for (int i = 0; i < 10; i++) {
    //      System.out.println("Ітерація: " + i);
    //    }
    //    boolean flag = true;
    //    int i = 0;
    //    while (flag) {
    //      if (i > 100) {
    //        flag = false;
    //      }
    //      System.out.println("Ітераці: " + i);
    //      i += 2;
    //    }

    //      int i = 11;

    //      do {
    //          System.out.println("приклад do while");
    //          System.out.println("Ітераці: " + i);
    //          i++;
    //      } while (i <= 10);
    //
    //      do {
    //          System.out.println("run some code");
    //      } while (true);

    //      while (true) {
    //          System.out.println("run some code");
    //      }

    //      for (int i = 0; i < 5; i++) {
    //          for (int j = 0; j < 3; j++) {
    //        System.out.print(i + " " + j);
    //        System.out.print("/");
    //          }
    //      System.out.println("");
    //      }

    //      for(;;) {
    //          System.out.println("run inifinitive loop");
    //          break;
    //      }
    //
    //      for (int i = 0; i < 10; i++) {
    //          if (i == 5) {
    //              continue;
    //          }
    //      System.out.println("i = " + i);
    //      }

    //    one:
    //    for (int i = 0; i < 5; i++) {
    //      two:
    //      for (int j = 0; j < 3; j++) {
    //          if (i == 2 && j == 2) {
    //              break two;
    //          }
    //        System.out.print(i + " " + j);
    //        System.out.print("/");
    //      }
    //      System.out.println("");
    //    }

    //    Integer[] a = new Integer[5];
    //    System.out.println(a.length);
    //    System.out.println(a[0]);
    //    System.out.println(a[1]);
    //    System.out.println(a[2]);
    //    System.out.println(a[3]);
    //    System.out.println(a[4]);
    //    System.out.println("-------------------");
    //    a[0] = 10;
    //    a[1] = 2;
    //    a[2] = 5;
    //    a[3] = 1;
    //    a[4] = 99;
    //    System.out.println(a[0]);
    //    System.out.println(a[1]);
    //    System.out.println(a[2]);
    //    System.out.println(a[3]);
    //    System.out.println(a[4]);
    //    System.out.println("-------------------");
    //    a[2] = null;
    //    a[3] = 100500;
    //    System.out.println(a[0]);
    //    System.out.println(a[1]);
    //    System.out.println(a[2]);
    //    System.out.println(a[3]);
    //    System.out.println(a[4]);
    //      Random r = new Random();
    //    for (int i = 0; i < a.length; i++) {
    //        a[i] = r.nextInt(47);
    //    }
    //
    //      for (int i = 0; i < a.length; i++) {
    //        System.out.println(a[i]);
    //      }
    //      Integer[] b = {1,2,3,4,5,6,7,8,8,9,90,0,65,7,567,56,7,7};
    //    for (int i = 0; i < b.length; i++) {
    //      System.out.println(b[i]);
    //    }
    //      Random r = new Random();
    //      int matrix[][][];
    //      matrix = new int[10][10][10];
    //
    //    for (int i = 0; i < 10; i++) {
    //        for (int j = 0; j < matrix[i].length; j++) {
    //            for (int c = 0; c < matrix[i][j].length; c++) {
    //                matrix[i][j][c] =  r.nextInt(47);
    //            }
    //        }
    //    }
    //
    //      for (int i = 0; i < 10; i++) {
    //          for (int j = 0; j < matrix[i].length; j++) {
    //              for (int c = 0; c < matrix[i][j].length; c++) {
    //                  System.out.print(matrix[i][j][c] + " ");
    //              }
    //              System.out.println("");
    //          }
    //      System.out.println("");
    //      }
    // int [][] a = new int[2][2];
    //      a[0] = {1,2};
    //      a[0][0] = 1;
    //      a[0][1] = 2;
    //      a[1] = {3,4};
    //      a[1][0] = 3;
    //      a[1][1] = 4;
    int[][] a = {
      {1, 2},
      {3, 4}
    };

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println("");
    }
  }
}
