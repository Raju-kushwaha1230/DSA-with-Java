package mighty.org.Problems_solutions;
/*
working with rotated array
- find the pivot
- search target in array
-return the index
*/

public class SearchRotated {
    static void main() {
        int[] nums = {1,1,3};
        int target = 0;
        System.out.println(search(nums,target));
    }

    static int search(int[] arr, int target){
        // find the pivote

        int pivot = findPivotDup(arr);
        if (pivot == -1){
            return binarySearch(arr, target,0 , arr.length -1);
        }
        //
        int resultRotated = binarySearch(arr, target, 0, pivot);
        // if found the result in pivot side element then return ans
        if (resultRotated != -1){
            return resultRotated;
        }
        return binarySearch(arr, target, pivot + 1, arr.length -1);
    }

    static int findPivot(int[] arr){
        int s =0;
        int e = arr.length -1;

        while (s <= e){
            int mid = s + (e - s)/2;
            // special case for rotated array
            if ( mid < e && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if ( mid > s && arr[mid]< arr[mid -1]){
                return mid -1;
            }

            // basic checking  for binary search

            if (arr[mid] <= arr[s]){
                e = mid - 1;
            }else {
                s = mid + 1;
            }

        }
        return -1;
    }

    static int findPivotDup(int[] arr){
        int s = 0;
        int e = arr.length -1;
        while (s <= e){
            int mid = s + (e -s)/ 2;
            if(mid < e && arr[mid] > arr[mid +1]){
                return mid;
            }
            if (mid > s && arr[mid] < arr[mid -1]){
                return mid -1;
            }
            // check duplicagte elements
            if (arr[mid] == arr[s] && arr[mid] == arr[e]){

                if ( s < e &&  arr[s] > arr[s+1]){
                    return s;
                }
                s++;
                if ( e > s &&  arr[e] < arr[e-1] ){
                    return e-1;
                }
                e--;
            }else if (arr[s] < arr[mid] || (arr[s] == arr[mid] && arr[mid] > arr[e])){
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int s,int e){
        while (s <= e){
            int mid = s + (e -s)/2;

            if (arr[mid] == target){
                return mid;
            }

            if (target > arr[mid]){
                s = mid + 1;
            }else {
                e = mid -1;
            }
        }
        return -1;
    }

}
