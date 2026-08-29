package org.raju;
// find the number of that have even number of digits in a array
public class FindDigits {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896,34,23,345234};
        int result = findNum(arr);
        System.out.println(result);

    }
    // rules
    // first find the number of digits and then divide by 2
     static int findNum(int[] arr) {
        int count = 0;
            for (int val: arr){
                if(even(val)){
                    count ++;
                }
            }
            return count;
    }
    static boolean even(int num){
        int digit = digit(num);
        if (digit % 2 == 0){
            return true;
        }
        return false;
    }
    static int digit(int num){
        int count = 0;
        while (num>0){
            count++;
            num = num/10;
        }
        return count;
    }

}
