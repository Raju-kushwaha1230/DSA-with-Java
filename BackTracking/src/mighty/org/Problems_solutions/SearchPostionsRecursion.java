package mighty.org.Problems_solutions;

public class SearchPostionsRecursion {
    static void main() {
        int[] num = {-1,3,5,6};
        int target = 7;
        System.out.println(num.length);
        System.out.println(search(num, target, 0, num.length - 1));
    }

    static int search(int[] nums, int target, int s,int e){


        if (s > e){
            return s;
        }


        int mid = s + ( e- s) /2;

        if (nums[mid] == target){
            return mid;
        }

        if (target > nums[mid]){
            return search(nums, target, mid + 1, e);
        }else{
            return search(nums, target, s, mid -1);
        }



    }
}
