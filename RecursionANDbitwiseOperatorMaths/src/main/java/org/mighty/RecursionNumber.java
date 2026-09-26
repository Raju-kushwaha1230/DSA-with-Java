package org.mighty;

public class RecursionNumber {
    public static void main(String[] args) {
        print(5);
    }

    // print a value upto given range
    // n=5 ->>> 1,2,3,4,5 using recursion
    static void print(int n){
        // base condition which stops new calls
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
