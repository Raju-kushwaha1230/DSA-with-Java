package org.raju;
// search target in mountain array
public class SearchMountain {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,4,2,1};
        int target = 2;
        int result = searchMountain(arr, target);
        System.out.println(result);
    }
    static int searchMountain(int[] arr, int target){
        int peakValue = peakInMountainArr(arr);
        int value = 0;
        value = binarySearch(arr, target, 0, peakValue, true);
        if (value != -1){
            return value;
        }
        return binarySearch(arr, target, peakValue + 1, arr.length-1, false);
    }
    static int peakInMountainArr(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
    static  int binarySearch(int[] arr, int target, int start, int end, boolean ascending){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                return mid;
            }
            if (ascending){
                if (target < arr[mid]){
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
