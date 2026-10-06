package Array;

import java.util.Arrays;

public class _1480_Running_sum {
    static void main() {
        int[] arr = {1,2,3,4}; // ans [1,3,6,10]
        int[] ans = new int[arr.length];
        System.out.println(Arrays.toString(sum(arr, 0, ans)));
    }

    static int[] sum(int[] arr, int index, int[] ans){

        int in = 0;
        if (index== arr.length){
            return ans;
        }
        if (index == 0){
            ans[index] =  arr[index];
        }else {
            ans[index] = ans[index - 1] + arr[index];
        }
        return sum(arr, index + 1, ans);
    }
}
