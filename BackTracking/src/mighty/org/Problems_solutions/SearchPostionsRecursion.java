package mighty.org.Problems_solutions;

public class SearchPostionsRecursion {
    static void main() {
        int[] num = {1,3,5,6};
        int target = 8;
        System.out.println(search(num, target, 0, num.length -1));
    }

    static int search(int[] nums, int target, int s,int e){

        if (s > e){
            return -1;
        }

        int mid = s + ( e- s) /2;

        if (nums[mid] == target){
            return mid;
        }
        if (e == s){
            if (target > s){
                return s+ 1;
            }
            return e - 1;
        }

        if (target > mid){
            return search(nums, target, mid + 1, e);
        }
        return search(nums, target, s, mid -1);
    }
}
