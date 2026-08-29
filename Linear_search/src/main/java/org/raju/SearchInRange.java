package org.raju;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {23,34,2,34,54,21,1};
        int target = 34;
        int result = linearSearch(arr,target,2,5);
        System.out.println(result);
    }

    static int linearSearch(int[] arr, int target,int start,int end){
        if (arr.length==0){
            return 0;
        }
        for (int i = start; i < end; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
