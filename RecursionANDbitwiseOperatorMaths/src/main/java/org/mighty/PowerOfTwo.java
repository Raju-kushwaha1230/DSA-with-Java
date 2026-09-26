package org.mighty;

public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 20;

        if ( num > 0 && (num & (num - 1)) == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
