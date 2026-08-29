package org.raju;

import java.util.Arrays;

//strictly sorted  manner
public class SortedMatrixSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr, 3)));
    }

    static int[] binarySearch(int[][] arr, int target, int row, int cStat, int cEnd){
        while (cStat <= cEnd){
            int mid = cStat + ( cEnd - cStat) / 2;
            if (arr[row][mid] == target){
                return new int[]{row,mid};
            }
            if (target < arr[row][mid]){
                cEnd = mid - 1;
            }else {
                cStat = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
    static int[] search(int[][] arr, int target){
        int row = arr.length;
        int col = arr[0].length;
        if (row == 1){
            return binarySearch(arr,target,0,0,col - 1 );
        }
        int rStart = 0;
        int rEnd = row -1;
        int cMid = col /2;
        while (rStart < rEnd){
            int mid = rStart + ( rEnd - rStart) /2;
            if (target == arr[mid][cMid]){
                    return new int[]{mid, cMid};
            }
            if (target < arr[mid][cMid]){
                row--;
            }else {
                col--;
            }
        }
        // now we got two row so search the target in that row
        if (target == arr[rStart][cMid]){
            return new int[]{rStart,cMid};
        }
        if (target == arr[rStart+1][cMid]){
            return  new int[]{rStart + 1, cMid};
        }

        if (target <= arr[rStart][cMid -1]){
            return binarySearch(arr, target, rStart,  0, cMid -1);
        }
        if (target >= arr[rStart][cMid + 1]  && target <= arr[rStart][col - 1]){
            return binarySearch(arr, target, rStart, cMid + 1, col -1);
        }
        if (target <= arr[rStart + 1][cMid -1]){
            return binarySearch(arr, target, rStart + 1, 0, cMid -1 );
        } else {
            return binarySearch(arr, target, rStart  + 1, cMid + 1, col -1);
        }
    }
}
