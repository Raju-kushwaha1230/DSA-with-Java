package org.raju;
// peak index in a mountain array
// num [1,2,3,5,6,4,3,2] ans = 6
public class FindPeakMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,3,2};
        int result = findPeak(arr);
        System.out.println(result);
    }

    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]){
                //you are in descending order
                end = mid;
            } else{
                // u are in ascending order
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
