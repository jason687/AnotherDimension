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

  public static int[] sumRows(int[][] matrix) {
    int [] array = new int[(matrix.length)];
    int [] temp;
    for (int i = 0; i < matrix.length; i++) {
      temp = new int [(matrix[i].length)];
      for (int j = 0; j < matrix[i].length; j++) {
        temp[j] = matrix[i][j];
      }
      array[i] = sum(temp);
    }
    return array;
  }

  public static int[] largestInRows(int[][] matrix) {
    int [] array = new int[(matrix.length)];
    int [] temp = new int[(matrix[0].length)];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        temp[j] = matrix[i][j];
      }
      array[i] = largest(temp);
      temp = new int [(matrix[i].length)];
    }
    return array;
  }

  public static int sum(int[][] arr) {
    int [] array = sumRows(arr);
    int total = sum(array);
    return total;
  }

  public static int[] sumCols(int[][] matrix) {
    int [] array = new int[(matrix[0].length)];
    int [] temp;
    for (int i = 0; i < matrix[0].length; i++) {
      temp = new int [(matrix.length)];
      for (int j = 0; j < matrix.length; j++) {
        temp[j] = matrix[j][i];
      }
      array[i] = sum(temp);
    }
    return array;
  }

  public static boolean isRowMagic(int[][] matrix) {
    int [] arrayRows = sumRows(matrix);
    int something = arrayRows[0];
    for (int i = 0; i < arrayRows.length; i++) {
      if (something != arrayRows[i]) {
        return false;
      }
    }
    return true;
  }

  public static boolean isColMagic(int[][] matrix) {
    int [] arrayCols = sumCols(matrix);
    int something = arrayCols[0];
    for (int i = 0; i < arrayCols.length; i++) {
      if (something != arrayCols[i]) {
        return false;
      }
    }
    return true;
  }
}
