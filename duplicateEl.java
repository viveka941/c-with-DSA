import java.util.HashSet;
import java.util.Set;

public class duplicateEl {
  public static int unEl(int arr[], int size) {
    int i = 0;
    for (int j = i ; i < size; j++) {
      if (arr[i] != arr[j]) {
        i++;
        arr[i] = arr[j];
      }

    }
    return i+1;
  }

  
  public static void main(String[] args) {
    int arr[] = { 1, 1, 2, 2, 2, 3, 3, 3, 3, 3 };
  int size=unEl(arr,arr.length);
  for(int i=0;i<size; i++){
    System.out.println(arr[i]);
  }


    Set<Integer> uni = new HashSet<>();
    for (int i : arr) {
      uni.add(i);
    }

    System.out.println(uni);

    System.out.println(uni.size());
  }

}
