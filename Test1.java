class Test2 {
  // public void m1() {
  // System.out.println("no arg");
  // }

  public void m1(int i) {
    System.out.println(" int arg");
  }

  public void m1(float i) {
    System.out.println("float arg");
  }
}

class Test3 {
  public void m1(Object o) {
    System.out.println("object Version");
  }

  public void m1(String s) {
    System.out.println("String version");
  }
}

public class Test1 {

  public static void m2(int i){
    System.out.println("General method");
  }
  public static void m2(int... i){
    System.out.println("var arg method");
  }

  public static void main(String args[]) {

    
    m2(233);
    m2(100, 000000);
    m2(233);
   
    // int arge (char permotated)
    Test2 t = new Test2();
    t.m1(10);
    t.m1(54.6f);
    t.m1('a');// most importent
    t.m1(45l);// most importent

    Test3 t3 = new Test3();
    t3.m1(new Object());
    t3.m1("Ram");
    t3.m1(null);
  }

}
