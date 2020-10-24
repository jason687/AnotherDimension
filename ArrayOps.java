public class ArrayOps {

  public static int sum (int [] arr) {
    int add = 0;
    for (int i = 0; i < arr.length; i++) {
      add = arr[i] + add;
    }
    return add;
  }

  public static int largest (int [] arr) {
    double temp = Double.NEGATIVE_INFINITY;
    for (int i = 0; i < arr.length; i++) {
      temp = Math.max(temp, arr[i]);
    }
    return ((int) temp);
  }
}
