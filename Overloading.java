import java.util.Scanner;

public class Overloading {
  public static int add(int a) {
    return a;
  }

  public static int add(int a, int b) {
    return a + b;
  }

  public static int add(int a, int b, int c) {
    return a + b + c;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("one " + add(7));
    System.out.println("tow " + add(5, 5));
    System.out.println("three " + add(5, 6, 7));
  }
}
