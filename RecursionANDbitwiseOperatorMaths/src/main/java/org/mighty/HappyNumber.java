package org.mighty;

import java.util.HashSet;
import java.util.Set;

/*
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

 */
public class HappyNumber {
    public static void main(String[] args) {
        int num = 232;
        System.out.println(findHappyNo(num));
    }
    static boolean findHappyNo(int num){
        Set<Integer> seen = new HashSet<>();

        while (num !=1 && !seen.contains(num)){
            seen.add(num);
            num = SumOfSquare(num);
        }

        return num == 1;
    }
    static int SumOfSquare(int num){
        int ans = 0;

        while (num > 0){
            int digit = num % 10;
            num /= 10;
            ans += digit * digit;
        }
        return ans;
    }
}
