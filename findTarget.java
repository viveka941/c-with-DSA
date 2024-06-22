public class findTarget {
  public static void target(int arr[], int target) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == target) {
          System.out.println(i + " " + j);
        }
      }
    }

  }

  public static int binarySearch(int arr[], int key) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = (start + end) / 2;
      if (arr[mid] == key) {
        return mid;
      } else if (key > arr[mid]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }

    }
    return -1;

  }

  public static void main(String[] args) {
    int arr[] = { 5, 3, 1, 2 };
    target(arr, 5);
    System.out.println(binarySearch(arr, 2));
  }
}
