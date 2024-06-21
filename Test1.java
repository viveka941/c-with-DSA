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
  public static void secondLarge(int arr[]) {
    int max = 0;
    int second = 0;
    for (int i = 0; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    for (int j = 0; j < arr.length; j++) {
      if (max > second && max > arr[j]) {
        second = arr[j];
      }

    }

    System.out.println(max);
    System.out.println(second);
  }

  public static void sort(int arr[], int size) {
    int arr2[] = new int[size];
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] < arr[j]) {
          arr2[i] = arr[i];
        }
      }
    }
    for (int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i] + " ");
    }
    System.out.println();
  }

  public static void main(String args[]) {
   
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
