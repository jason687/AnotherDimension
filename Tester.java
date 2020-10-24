import java.util.Arrays;

public class Tester {
  public static void main (String[] args) {
    int [] arr = {1, 2, 3, 4};
    int[][]  A = {{1, 0, 12, -1}, {7, -2, 2, 1}, {-5, -2, 2, -9}};
//    System.out.println(ArrayOps.sum(arr));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
  }
}
