package ua.lits.lesson7;

public class Main {
  private String type = "main";
  private static String staticType = "main";

  public static void main(String[] args) {
    //    Vehicle car = new Car();
    //    car.addPetrol(Fuel.DIESEL);
    //    car.run();
    //    ((Car) car).sound();
    //
    //    Lorry lorry = new Lorry();
    //    lorry.run();
    //    lorry.addPetrol((fuel) -> {
    //        if (lorry.getFuel().equals(fuel)) {
    //            System.out.println("adding fuel");
    //        }  else {
    //            System.out.println("Wrong type of fuel");
    //        }
    //    });
    //    lorry.sound();
    //    Vehicle2.doRepair();
    //
    //    System.out.println(Fuel.PETROL);
    //
    //    System.out.println("------------------");
    //
    //    for (Fuel fuel: Fuel.values()) {
    //      System.out.println(fuel);
    //    }
    //
    //    System.out.println("------------------");
    //
    //    System.out.println(Fuel.findByName("D"));
    //
    //    System.out.println(Fuel.valueOf("PETROL"));

    //      Main main = new Main();
    //      main.showInnerClass();
    //      main.createMethodInnerClass();
    //      Main.Inner inner = new Main().new Inner();
    //      inner.printText();

    //    AddingPetrol anonymous =
    //        new AddingPetrol() {
    //          @Override
    //          public void apply(Fuel fuel) {
    //            System.out.println("this is our first anonymous class");
    //          }
    //        };
    //      anonymous.apply(Fuel.DIESEL);
    //
    //    Lorry lorry = new Lorry();
    //    lorry.run();
    //    lorry.addPetrol(new AddingPetrol() {
    //        @Override
    //        public void apply(Fuel fuel) {
    //            System.out.println("this is our first anonymous class");
    //        }
    //    });
//    Main.NestedStatic nestedStatic = new Main.NestedStatic();
//    nestedStatic.print("This is our first static inner class");
      first.launch();
  }

  private class Inner {
    public void printText() {
      System.out.println(type);
      System.out.println("This is inner class");
    }
  }

  public static class NestedStatic {
    public void print(String message) {
      System.out.println(staticType);
      System.out.println(message);
    }
  }

  void showInnerClass() {
    Inner i = new Inner();
    i.printText();
  }

  void createMethodInnerClass() {

    String text = "Text for method inner class";

    class MethodInnerClass {
      public void print() {
        System.out.println(text);
      }
    }

    MethodInnerClass methodInnerClass = new MethodInnerClass();
    methodInnerClass.print();
  }

  static Boat first =
      new Boat() {
        @Override
        void launch() {
          super.launch();
          System.out.println("static variable");
        }
      };

  static AddingPetrol addingPetrol = new AddingPetrol() {
      @Override
      public void apply(Fuel fuel) {
          System.out.println("static variable");
      }
  };
}
