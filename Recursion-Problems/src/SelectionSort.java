import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    static void main() {
        int[] arr = {6,4,8,2,9,1,3};

        System.out.println(Arrays.toString(selection(arr, arr.length, 0, 0 )));
    }

    static int[] selection(int[] arr, int r, int c, int max){
        if (r == 0){
            return arr;
        }
        if ( c < r){

            if ( arr[c] > arr[max] ){
                return selection(arr, r, c+1, c);
            }else {
                return selection(arr, r, c+ 1, max);
            }
        }else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;

        }
        return selection(arr, r-1, 0, 0);
    }
}
