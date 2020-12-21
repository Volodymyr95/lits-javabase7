package ua.lits.lesson8;

public class Main {
  public static void main(String[] args) {
    //      String one = "Our first language";
    //      String two = new String("Our first language");
    //      String three = one;
    //      String four = "four String";

    //      one == two  -> false
    //      one.equals(two)   -> true
    //      one == three -> true
    //      one.equals(three) - true
    //      one == four -> false
    //      one.equals(four) -> false

    //      System.out.println(one + " Java");
    //      System.out.println(one.concat(" Java"));
    //      System.out.println(String.format("Our first language %s", "Java"));
    //      System.out.println(String.join(" ", one, "Java"));
    //      List<String> ids = Arrays.asList("12","14","34","66");
    //      String elemens = "";
    //      for (String id : ids) {
    //          elemens = elemens + "," + id;
    //      }
    //    System.out.println(elemens.substring(1));
    //      for (int i = 0; i < ids.size(); i++) {
    //          elemens += ids.get(i);
    //
    //          if (i != ids.size() - 1) {
    //              elemens +=  ", ";
    //          }
    //
    //      }
    //    System.out.println(elemens);
    //    System.out.println(String.join(", ", ids));
    //
    //      System.out.println(one.substring(4));
    //      System.out.println(one.substring(4, 9));
    //      long startTime = System.currentTimeMillis();
    //      StringBuffer stringBuffer = new StringBuffer("StringBuffer for 1000 items");
    //      for (int i = 0; i < 1000; i++) {
    //          stringBuffer.append(" i");
    //      }
    //
    //      System.out.println("Time taken by StringBuffer for 1000: " + (System.currentTimeMillis()
    // - startTime) + " ms");
    //
    //      startTime = System.currentTimeMillis();
    //      StringBuffer stringBuffer2 = new StringBuffer("StringBuffer for 1000000");
    //      for (int i = 0; i < 1000000; i++) {
    //          stringBuffer2.append(" i");
    //      }
    //      System.out.println("Time taken by StringBuffer for 1000000: " +
    // (System.currentTimeMillis() - startTime) + " ms");
    //
    //      startTime = System.currentTimeMillis();
    //      StringBuilder stringBuilder = new StringBuilder("StringBuilder for 1000 items");
    //      for (int i = 0; i < 1000; i++) {
    //          stringBuilder.append(" i");
    //      }
    //
    //      System.out.println("Time taken by StringBuilder for 1000: " +
    // (System.currentTimeMillis() - startTime) + " ms");
    //
    //      startTime = System.currentTimeMillis();
    //      StringBuilder stringBuilder2 = new StringBuilder("StringBuilder for 1000000 items");
    //      for (int i = 0; i < 1000000; i++) {
    //          stringBuilder2.append(" i");
    //      }
    //
    //      System.out.println("Time taken by StringBuilder for 1000000: " +
    // (System.currentTimeMillis() - startTime) + " ms");

    StringBuilder sb = new StringBuilder("Our");
    sb.append(" ");
    sb.append("first");
    sb.append(" ");
    sb.append("language");
    sb.append(" ");
    sb.append("is");
    sb.append(" ");
    sb.append("Java");
    System.out.println(sb.toString());
  }
}
