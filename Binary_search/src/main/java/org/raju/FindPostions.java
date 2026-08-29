package org.raju;

import java.lang.reflect.Array;
import java.util.Arrays;

// find first and last postion of elements in sorted array
//nums =[5,7,7,8,8,10] target = 8 output = [3,4]
public class FindPostions {
    public static void main(String[] args) {
        int[] nums = {5,7,8,8,8,8,10};
        int target = 10;
        int[] result = findPositions(nums, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] findPositions(int[] nums, int target ){
            int[] result = {-1, -1};
            int start = search(nums,target,true);
            int end = search(nums, target, false);
            result[0] = start;
            result[1] = end;
            return result;
    }
    static int search(int[] arr, int target, boolean isStartIndex){
        int start = 0;
        int end = arr.length -1;
        int ans = -1;
        while (start <= end){
            int mid = start + ( end - start) / 2;
            if (target < arr[mid]){
                end = mid-1;

            } else if (target > arr[mid]) {
                start = mid+ 1;
            } else { // this will handle equal statement
                ans = mid;
                if (isStartIndex){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}
