package org.raju;

public class RotationCountRotateArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int result = countRotate(arr);
        System.out.println(result);
    }

    static int countRotate(int[] arr){
        int pivoteVal = findPivote(arr);
        if (pivoteVal == -1){
            return  0;
        }
        return pivoteVal + 1;
    }
    static int findPivote(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if (arr[mid] <= arr[start]){
                end = mid-1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
