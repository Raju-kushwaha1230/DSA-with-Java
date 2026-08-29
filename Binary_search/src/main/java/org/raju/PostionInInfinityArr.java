package org.raju;
// find postion of an element in a sorted array if infinity number
//
public class PostionInInfinityArr {
    public static void main(String[] args) {
        int[] nums = {2,3,5,6,7,9,10,13,15,16,19,34};
        int target = 4;
        int result = finalAnswer(nums,target);
        System.out.println(result);
    }

    static int finalAnswer(int[] arr, int target){
        int start = 0;
        int end = 1;
        while (target >= arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return BinarySearch(arr,target,start,end);
    }
    static  int BinarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;

            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return Integer.MIN_VALUE;

    }
}
