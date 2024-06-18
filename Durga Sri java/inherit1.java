

class P {
  public void m1() {
    System.out.println("Parrent");
  }
}

class C extends P {
  public void m2() {
    System.out.println("child");
  }
}







public class inherit1 {
public static void main(String[] args) {
    P p = new P();
    p.m1(); //✅
    // p.m2(); //❌
    C c = new C();
    c.m1();
    c.m2();

    P child = new C();
    child.m1();
    // child.m2();
    C child1 = new P();
    c.m1();
    c.m2();
}
 

}
