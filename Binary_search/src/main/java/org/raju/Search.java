package org.raju;

public class Search {
    public static void main(String[] args) {
        int[] arr = {2,5,7,10,16,19,30,45,65 };//sorted array
        int target = 2;
        int result = binary_search(arr,target);
        System.out.println(result);

    }
    // mid = start + end , if target > mid -> start = mid+1 else if target < mid -> end= mid-1
     static int binary_search(int[] arr, int target) {
       int start = 0;
       int size = arr.length;
       int end = size-1;
       while(start <= end){
//            int mid = (start + end ) / 2;
           int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid+1;
            } else if(target < arr[mid]){
                end = mid - 1;
            }else if (target == arr[mid]){
                return mid;
            }

       }
       return -1;
    }
}
