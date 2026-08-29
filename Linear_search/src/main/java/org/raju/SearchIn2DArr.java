package org.raju;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchIn2DArr {
    public static void main(String[] args) {
        int[][] arr = {
                {2,34,45},
                {54,23,87},
                {98,86,43}
        };
        int target = 2;
        int[] result = search(arr,target);
        System.out.println(Arrays.toString(result));
    }

    static int[] search(int[][] arr, int target){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }

            }
        }

        return new int[]{-1};


    }
}
