package Array;

import java.util.Arrays;

public class _1920_Build_Array {
    static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        int[] ans= build(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] build(int[] arr){
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            ans[i]  = arr[a];
        }
        return ans;
    }
}
