package Level_1_Questions;

public class SumOfDigits {
    static void main() {
        System.out.println(sum(9876));// 17 + 13 =
    }
    static int sum(int n){
        int a = n;
        if (n < 1){
            return 0;
        }

        return n % 10 + sum(n /  10);
    }
}
