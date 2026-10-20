package mighty.org.Problems_solutions;

public class SearchInsertpostions {
    static void main() {
        int[] num = {1,3,5,6};
        int target = 8;
        System.out.println(returnPostions(num, target));
    }
    static int returnPostions(int[] nums, int target){
        int s = 0;
        int e = nums.length - 1 ;

        while (s <= e){
            int mid = s + (e - s ) / 2;

            if (nums[mid] == target){
                return mid;
            }
            if (target > nums[mid]){
                s = mid+ 1;
            }
            if (target < nums[mid]){
                e = mid  - 1;
            }
            if (s == e){
                if (target >s){
                    return s+1;
                }
                return e-1;
            }
        }
        return -1;
    }
}
