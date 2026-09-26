package org.mighty;
//Given an integer num, return the number of digits in num that divide num.
public class CountDigit {
    public static void main(String[] args) {
        int num = 7;
        int original = num;
        int ans = 0;
        int count = 0;
        while( num > 0){
            int digit = num % 10;
            num /= 10;

            if (digit != 0 && original % digit == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
