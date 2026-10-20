package mighty.org.Problems_solutions;
import java.util.Arrays;

public class findPositions34 {
    static void main() {
        int[] nums = {5,7,7,8,8,10};
        int target = 5;
        int[] ans = find(nums,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] find(int[] arr, int target){
        int[] ans = {-1,-1};
        ans[0]  = findBound(arr, target, true);
        if (ans[0] == -1) return ans;

        ans[1] = findBound(arr, target, false);
        return ans;

    }

    static int findBound(int[] arr, int target, boolean isFirst){

        int s = 0;
        int e = arr.length -1;
        int ans = -1;

        while(s <= e){
            int mid = s + (e -s)/2;

            if (arr[mid] == target){
                ans = mid;
                if (isFirst){
                    e = mid -1;
                }else {
                    s = mid +1;
                }
            } else if (target > arr[mid]) {
                s = mid + 1;
            }else {
                e = mid -1;
            }
        }

        return ans;

    }

    static int[] search(int[] nums, int target){
        int s = 0;
        int e = nums.length -1;
        int[] ans = {-1,-1};
        int f = 0;
        int l = 0;

        while (s <= e){
            int mid = s + (e - s) /2;

            if (nums[mid] == target){

                if (nums[mid + 1] == target){
                    e = mid+1;
                    s = mid;
                }
                if (nums[mid -1 ] == target){
                    s = mid -1;
                    e = mid;
                }
                else {
                    s = mid;
                    e = mid;
                }
                ans[0] = s;
                ans[1] = e;

                return ans;

            }
            if (target > nums[mid]){
                s = mid+ 1;
            }
            if (target < nums[mid]){
                e = mid  - 1;
            }
        }

        return ans;
    }


}
