 class Test2 {
  // public void m1() {
  //   System.out.println("no arg");
  // }

  public void m1(int i) {
    System.out.println(" int arg");
  }

  public void m1(float i) {
    System.out.println("float arg");
  }
}
public class Test1{
  public static void main(String args[]){
        // int arge (char permotated)
       Test2 t = new Test2();
          t.m1(10);
          t.m1(54.6f);
          t.m1('a');// most importent
          t.m1(45l);//most importent
        }
      
}
