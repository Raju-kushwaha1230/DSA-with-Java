package org.raju;

import java.util.Arrays;

public class CustomerWeakth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1},{4,5,7}};
        int result = findWealth(accounts);
        System.out.println(result);

    }

    static int findWealth(int[][] arr){
        int result = Integer.MIN_VALUE;
        for (int person = 0; person < arr.length; person++) {
            int sum = 0;
            for (int wealth = 0; wealth < arr[person].length; wealth++) {
                sum += arr[person][wealth];
//                System.out.println(arr[person][wealth]);
            }
            if (result < sum){
                result = sum;
            }
        }
        return result;
    }
}
