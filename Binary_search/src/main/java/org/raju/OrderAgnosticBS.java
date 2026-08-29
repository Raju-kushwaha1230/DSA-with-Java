package org.raju;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {2,4,6,7,12,34,56,78,99};
        int[] arr = {90,87,76,65,43,10,6,4,2};
        int target = 43;
        int result = orderAgnosticBS(arr, target);
        System.out.println(result);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        // check the array is acsending order or descesnding order
        boolean isAgnos = arr[start] < arr[end];
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            }
            if (isAgnos){
                if (target > arr[mid]){
                    start = mid + 1;

                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]){
                    start = mid + 1;

                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
