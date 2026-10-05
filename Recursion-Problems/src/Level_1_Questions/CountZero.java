package Level_1_Questions;

public class CountZero {
    static void main() {
        System.out.println(count(10200020));
    }
    static  int count(int n){
        return helper(n,0);
    }
    static int helper(int n, int c){
        // here if the digit is 0 then increment c otherwise leave it;

        if (n== 0){
            return c;
        }
        int rem = n % 10;

        if (rem == 0){
            return helper(n / 10, c+1);
        }
        return  helper(n/10, c);
    }
}
