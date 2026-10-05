package Level_1_Questions;

public class Palindrome {
    static void main() {
        System.out.println(palin(-1)); // 1234321
    }

    static boolean palin(int n){
        if (n < 0){
            return false;
        }
        return n == rev(n);
    }
    static int rev(int n){
        int digit = (int) (Math.log10(n) + 1);
        return helper(n,digit);
    }
    static int helper(int n,int digit){
        if (n % 10 == n){
            return n;
        }

        return ( n % 10) * (int)( Math.pow(10, digit - 1)) + helper(n / 10, digit -1 );
    }
}
