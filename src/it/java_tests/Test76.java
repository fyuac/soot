class Helper {

  public static void main(String[] args) {}

  public void action() {
    System.out.println("Helper");
  }
}

public class Test76 {

  public static void main(String[] args) {
    Test76 t76 = new Test76();
    t76.run(5);
  }

  public void run(final int x) {
    new Helper() {

      public void action() {

        class MyHelper1 {
          public void action() {
            System.out.println(x);

            new Helper() {
              public void action() {
                System.out.println(x * x);
                class MyHelper2 {
                  public void action() {
                    System.out.println(x * x * x * x * x);
                  }
                };
                MyHelper2 m2 = new MyHelper2();
                m2.action();
              }
            }.action();
          }
        };
        MyHelper1 m1 = new MyHelper1();
        m1.action();
      }
    }.action();
  }
}
