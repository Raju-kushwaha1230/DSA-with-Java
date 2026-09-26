package org.mighty;

public class RecursionExampleNumber {
    public static void main( String[] args){
        print(1);
    }

    static void print(int n){
        // base condition which stops new calls
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
