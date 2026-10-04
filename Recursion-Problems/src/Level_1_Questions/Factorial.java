package Level_1_Questions;

public class Factorial {
    static void main() {
        System.out.println(factorial(5));
    }

    static int factorial(int n){

        if (n <= 1){
            return 1;
        }

        return n * factorial(n-1);
    }
}
