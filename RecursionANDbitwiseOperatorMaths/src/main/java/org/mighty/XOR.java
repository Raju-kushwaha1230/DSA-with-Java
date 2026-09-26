package org.mighty;
/*
The bitwise XOR sum of numbers from 0 to n can be computed efficiently in O(1) time by following a repeating repeating pattern based on n % 4.
The XOR Pattern from 0 to n
• If n % 4 == 0, the XOR sum is n.
• If n % 4 == 1, the XOR sum is 1.
• If n % 4 == 2, the XOR sum is n + 1.
• If n % 4 == 3, the XOR sum is 0.


0 ^ 1 = 1
1 ^ 1 = 0
 */
public class XOR {
    public static void main(String[] args) {
        // range xor for a, b = xor(b) ^ xor( a-1)
        int a = 3;
        int b = 100;
        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);

        // checking purpose
        int ans2 = 0;
        for (int i = a; i <= b; i++) {
            ans2 ^= i;
        }
        System.out.println(ans2);
    }

    static int xor(int n){
        if(n % 4 ==0){
            return n;
        }
        if( n% 4 == 1){
            return 1;
        }
        if(n % 4 == 2){
            return n+1;
        }
        return 0;
    }
}
