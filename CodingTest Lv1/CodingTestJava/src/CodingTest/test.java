package CodingTest;

import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] arr = { 1, 10, 4, 17, 9, 25, 3 };
    // Arrays.sort(arr, 0, arr.length);
    Arrays.sort(arr, 0, 4);
    System.out.println(Arrays.toString(arr));
  }
}
