package org.raju;
// search in Rotate array
 //For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].
public class searchInRotateArray {
    public static void main(String[] args) {
        int[] arr = {0,1};
        int target = 1;
        int[] arr2 = {2,4,2,2};
        int pivoteNum = findPivote(arr2);
        System.out.println(pivoteNum);
        int result = searchInRotate(arr, target);
        System.out.println(result); // 4 index
    }
    static int searchInRotate(int[] arr, int target) {
        int pivoteNum = findPivote(arr);
        System.out.println(pivoteNum);
        int result = binarySearch(arr, target,0,pivoteNum);
        if (pivoteNum == -1){
            return  binarySearch(arr, target,0,arr.length - 1);
        }
        if (result != -1){
            return result;
        }
        return binarySearch(arr, target, pivoteNum+1,arr.length -1);
    }
    static int findPivote(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start < end){
            int mid = start +(end - start) / 2;

           if ( mid < end && arr[mid] > arr[mid+1]){
               return mid;
           }
           if ( mid > start && arr[mid] < arr[mid -1]){
                return mid - 1;
            }
           if (arr[mid] <= arr[start]){
               end = mid -1;
           } else {
               start = mid + 1;
           }
        }
        return  -1;
    }
    static int findPivoteDuplicate(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + ( end - start) / 2;
            if ( mid < end && arr[mid] > arr[mid+1] ){
                return mid;
            }
            if (mid >  start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                if (arr[start] > arr[start + 1]){
                    return start;
                }
                start ++;
                if (arr[end] < arr[end - 1]){
                    return end -1;
                }
                end++;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return  -1;
    }

    static  int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + ( end - start)/ 2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
