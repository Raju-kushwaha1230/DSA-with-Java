package org.raju;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,9,14,17,19,34};
        int target = 10;
        int result = findCeilingNum(arr, target);
        System.out.println(result);
    }

    static int findCeilingNum(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[end]){
            return -1;
        }
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                return arr[mid];

            } else if (target > arr[mid]) {
                start = mid + 1;


            } else if (target < arr[mid]){
                end = mid-1;

            }
        }
        return arr[start];
    }
}
