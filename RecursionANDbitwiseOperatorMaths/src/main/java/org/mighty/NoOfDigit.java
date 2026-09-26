package org.mighty;

public class NoOfDigit {
    public static void main(String[] args) {
        int num = 10;
        int base = 2; // in binary , ifisay base 10means thats in decimal


        int ans = (int)(Math.log(num)/ Math.log(base)) +1;

        System.out.println(ans);
    }
}
