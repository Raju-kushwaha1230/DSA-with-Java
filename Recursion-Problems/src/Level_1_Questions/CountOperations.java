package Level_1_Questions;

public class CountOperations {
    static void main() {
        int num1 = 10 ;
        int num2 = 10;
        System.out.println(count(num1,num2));
    }
    static int count(int num1, int num2){
        return helper(num1, num2, 0);
    }
    static int helper(int a, int b, int steps){
        if( a == 0 || b == 0 ){
            return steps;
        }

        if(a >= b){
            return helper( a -= b, b , steps+ 1);
        }
        return helper(a, b -= a, steps + 1);
    }
}
