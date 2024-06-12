import java.util.Scanner;

public class passByValues {
  public static void values(int n){
    n++;
    System.out.println("n is = "+n);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    values(n);
    System.out.println(n);

  }
}
