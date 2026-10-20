package mighty.org.Problems_solutions;

public class FindMinimumRotated {
    static void main() {
        int[] nums = {11,13,15,17};
        System.out.println(search(nums));
    }
    static int  search(int[] arr){
        int pivot = findPivot(arr);
        if (pivot != -1){
            return arr[pivot+1];
        }
        return findMin(arr,0,arr.length -1);
    }

    static int findMin(int[] arr, int s,int e){
        return arr[s];
    }
    static int findPivot(int[] arr){
        int s = 0;
        int e = arr.length -1;

        while (s<=e){
            int mid = s +(e - s)/2;

            if (arr[mid] > arr[mid + 1]){
                return mid;
            }

            if (arr[mid] < arr[mid-1]){
                return mid-1;
            }

            if (arr[mid] <= arr[s]){
                e = mid -1;
            }else {
                s = mid + 1;
            }
        }
        return -1;
    }
}
