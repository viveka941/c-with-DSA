
class P {
  public void property() {
    System.out.println("Cashi + gold + Land");
  }

  public void Marry() {// overridden
    System.out.println(" prant ammpalamaa/subbalumai");
  }
}

class C extends P {
  public void Marry() { // overriding method
    System.out.println(" child Katrina");
  }
}

public class cast5Overloading {

  public static void main(String[] args) {
    P p = new P();
    p.Marry();

    C c = new C();
    c.Marry();

    P p2 =new C();
      p2.Marry();

  }
}