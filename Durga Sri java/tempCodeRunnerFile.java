import java.util.Scanner;

public class gessNo {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("You gess Number");
    int user = s.nextInt();
    System.out.println("user 1 gess number");
    int user1 = s.nextInt();
    System.out.println("user 2 gess number");
    int user2 = s.nextInt();
    System.out.println("user 3 gess number");
    int user3 = s.nextInt();

    if (user == user1 && user == user2 && user == user3) {
      System.out.println("win 1,2,3");
