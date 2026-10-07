public class ReverseDigit {
    static void main() {
        System.out.println(reverse(-934));
    }

    static int reverse(int n){

        int digit = (int) (Math.log10(n));
        return helper(n,digit );
    }

    static int helper(int n,int digit){
        if ( n % 10 == n){
            return n;
        }

        return (n % 10 ) * (int) ( Math.pow(10, digit)) + helper(n / 10, digit - 1);
    }
}
