public class ArrayOps {
  public static int sum (int [] arr) {
    int add = 0;
    for (int i = 0; i < arr.length; i++) {
      add = arr[i] + add;
    }
    return add;
  }
}
