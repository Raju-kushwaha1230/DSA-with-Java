package org.mighty;

public class SetBit {
    public static void main(String[] args) {
        int n = 1011;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBit(n));

    }

    static int setBit(int n){
        int count = 0;

        // first way
//        while (n > 0){
//            count++;
//
//            n -= (n & -n); // (n & -n) checks the right most bit ;
//
//        }

        // second way

        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}
