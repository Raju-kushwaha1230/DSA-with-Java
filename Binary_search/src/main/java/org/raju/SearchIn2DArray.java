package org.raju;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30},{12,23,34}};
        int[] result = search(arr,30);
        System.out.println(Arrays.toString(result));


    }
    static  int[] search(int[][] arr, int target){
        int r = 0;
        int c = arr.length -1;
        while (r < arr.length && c > 0){
            if (arr[r][c] == target){
                return new int[]{r,c};
            }
            if (arr[r][c] < target){
                r++;
            }else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
