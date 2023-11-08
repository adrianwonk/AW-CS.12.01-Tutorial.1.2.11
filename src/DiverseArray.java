public class DiverseArray {
    public static int arraySum(int[] arr){
        int result= 0;
        for (var value: arr){
            result += value;
        }
        return result;
    }
    public static int[] rowSums(int[][] arr){
        int[] result = new int[arr.length];
        int i = 0;
        for (var value : arr ){
          result[i] = arraySum(value);
          i++;
        }
        return result;
    }

    public static boolean isDiverse(int[][]arr){
        int[] array = rowSums(arr);

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++){
                System.out.println("" + array[i] + " " + array[j]);
                if(array[i] == array[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
