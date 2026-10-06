package Array;

import java.util.Arrays;

public class _1672_Richest_customer {
    static void main() {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(findMax(accounts));
    }

    static int findMax(int[][] accounts){
        int max = 0;
        for (int[] customer : accounts){
            int sum = 0;
            System.out.println(Arrays.toString(customer));
            for (int x : customer){
                sum += x;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
