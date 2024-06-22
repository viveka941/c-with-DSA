import java.util.Arrays;

public class ArrayBasic {

  // while(start <= end){
  // swap(arr[start],arr[end]){
  // start++
  // end--
  // }

  // swap alternat
  // pair sum
  // tripalet sum
  // sort zero ones
  // find uniaue element
  // find duplicates
  public static void swap(int arr[]) {
    int start = arr[0];
    int end = arr.length - 1;
    while (start <= end) {
      int temp = start;
      start = end;
      end = temp;

      start++;
      end--;
    }
    System.out.println();
  }

  public static void alternativeSwap2(int arr[]) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[start + 2];
      arr[start + 2] = temp;

      start += 2;
      end -= 2;
    }
    System.out.println();
  }

  public static void findDuplication(int arr[]){
    for(int i=0; i<arr.length; i++){
      for(int j=i+1;j<arr.length; j++){
        if(arr[i]==arr[j]){
          System.out.println(arr[j]);
        }else{
          System.out.println("not find");
        }
      }
    }
  }
  public static void pairSum(int arr[]) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      int current = arr[i];
      for (int j = i + 1; j < arr.length; j++) {
        System.out.print("(" + current + "," + arr[j] + ")");
        sum++;
        System.out.println();
      }

    }
    System.out.println(sum);
  }

  public static void sort(int arr[]){
    Arrays.sort(arr);
    int last = arr.length;
    int lastEl=arr[last-1];
    System.out.println(arr[arr.length-1]-1);
    System.out.println();
  }
  public static void main(String[] args) {
    int arr[] = { 2, 4, 34,6 };
    sort(arr);
    // swap(arr);
    // for (int i : arr) {
    //   System.out.print(i + " ");
    // }
    pairSum(arr);
    findDuplication(arr);
  }
}
