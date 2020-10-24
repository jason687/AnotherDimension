import java.util.Arrays;

public class Tester {
  public static void main (String[] args) {
    int [] arr = {1, 2, 3, 4};
    int [][] A = {{1, 0, 12, -1}, {7, -2, 2, 1}, {-5, -2, 2, -9}};
    int [] B = {1, 3, 5};
    System.out.println(A.length);
    System.out.println(A[0].length);
//    System.out.println(ArrayOps.sum(arr));
//    System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
    System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
    System.out.println(Arrays.toString(ArrayOps.sumCols(A)));
    System.out.println(ArrayOps.sum(A));
    System.out.println(ArrayOps.sum(B));
  }
}
