package ua.lits.lesson13;

import ua.lits.lesson13.interfaces.*;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public String className = "Main";

  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }

  public void run() {
//    LongToIntInterface converter =
//        new LongToIntInterface() {
//          @Override
//          public Integer apply(Long a) {
//
//            return Objects.nonNull(a) ? a.intValue() : null;
//          }
//        };
//    Integer one = converter.apply(10L);
//
//    LongToIntInterface converterLambdas =
//        a -> {
//          Integer i = Objects.nonNull(a) ? a.intValue() : null;
//          return i;
//        };
//
//    Integer two = converterLambdas.apply(12L);
//
//    System.out.println(one.getClass());
//
//    System.out.println(two.getClass());
//
//    LoggerInterface first =
//        new LoggerInterface() {
//          private String className = "LoggerInterface";
//
//          @Override
//          public void print(String a) {
//            System.out.println(this.className + ": a");
//          }
//        };
//
//      LoggerInterface second = a -> {
//          String className = "LoggerInterface";
//          System.out.println(this.className + ": a");
//      };
//
//      first.print("test anonimus class");
//      second.print("test lambdas");
//
//      Executor executor = new ExecutorImpl();
//      executor.execute((Callable<String>)() -> "a");
//      executor.execute((Supplier<String>)() -> "a");
//
//      StringProcessor processor1 = (a, b) -> a + " " + b;
//
//      String delimeter = "-";
//      StringProcessor processor2 = (String a, String b) -> {
//         return a + delimeter + b;
//      };
//
//      Map<String, List<String>> sizes = new HashMap<>();
//      sizes.put("T-shirt", Arrays.asList("L", "XL", "XXL"));
//
//      Map<String, Integer> articleMap = new HashMap<>();
//
//      Integer countTshirt = articleMap.computeIfAbsent("T-shirt", s -> sizes.containsKey(s) ? sizes.get(s).size() : 0);
//      Integer countShirt = articleMap.computeIfAbsent("Shirt", s -> sizes.containsKey(s) ? sizes.get(s).size() : 0);
//    System.out.println(countTshirt + " " + countShirt);
//    short[] arr = {(short) 1, (short) 2, (short) 3};
//      byte[] bytes = transform(arr, a -> (byte) a);
//
//      Supplier<User> userSuplier = () -> new User("Peter", "Griffin");
//      User user = userSuplier.get();
//      Mark matMark = user.getMarkFromMath();


      List<String> names = Arrays.asList("Peter", "John", "Valera");
    names.forEach(this::print);
    System.out.println("___________________");
    names.stream().filter(name -> name.equals("Peter")).forEach(this::print);
      System.out.println("___________________");
    names.stream().filter(name -> test(a -> a.equals("Peter"), name)).forEach(this::print);
  }

  public boolean test(Predicate<String> predicate, String name) {
      return predicate.or(e -> e.equals("John")).test(name);
  }


  public void print(String s) {
    System.out.println(s);
  }


  public byte[] transform(short[] shorts, ObjectToByte function) {
      byte[] bytes = new byte[shorts.length];
      for (int i =0; i < shorts.length; i++) {
          bytes[i] = function.apply(shorts[i]);
      }
      return bytes;
  }

}
