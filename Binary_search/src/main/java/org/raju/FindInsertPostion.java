package org.raju;
//return the index if the target is found. if not , return the index where it would be inserted in order
// nums= [1,3,5,6] target = 5 ans = 2 ; target = 2 ans = 1
public class FindInsertPostion {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,10};
        int target = 7;
        int result = findPosition(arr, target);
        System.out.println(result);
    }
    static int findPosition(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid -1;
                ans = mid-1;
            } else if (target > arr[mid]) {
                start = mid + 1;
                ans = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
