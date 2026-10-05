package Level_1_Questions;

public class ReverseDigit {
    static void main() {
        System.out.println(reverse1(1));
    }
    static int sum = 0;
    static int reverse(int n){

        if (n == 0){
            return 0;
        }
        int rem = (n % 10);
        sum = sum * 10 + rem;
        reverse(n / 10);
        return sum;
    }

    static int reverse1(int num){
        int digit = (int)(Math.log10(num) + 1);
        System.out.println(digit);

        return helper(num, digit);

    }
    static int helper(int n, int didit){
        if (n%10 == n){
            return n;
        }
        int rem = n% 10;
        return rem * (int) ( Math.pow(10, didit - 1)) + helper(n / 10, didit -1);
    }
}
