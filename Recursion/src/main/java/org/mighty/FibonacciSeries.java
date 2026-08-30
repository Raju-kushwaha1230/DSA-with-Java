package org.mighty;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(Fibo(6));
    }
    static  int Fibo(int n){
        if(n < 2){
            return n;
        }
        return Fibo(n-1) + Fibo(n-2);
    }
}
