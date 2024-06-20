import java.util.Scanner;

public class packtest {

  public int m1(int i) {
    return i;
  }



  public static boolean target(int arr[], int target) {

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] == target) {
        return true;
      }
    }
    return false;
  }

  public static void maxValue(int arr[]) {

    int max = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] < max) {
        max = arr[i];

      }

    }
    System.out.println(max);

  }

  public static void main(String[] args) {

    int arr[] = { 1, 22, 113, 14, 5 };
    maxValue(arr);

    packtest t = new packtest();
    t.m1(45);

    System.out.println(target(arr, 114));

  }
}