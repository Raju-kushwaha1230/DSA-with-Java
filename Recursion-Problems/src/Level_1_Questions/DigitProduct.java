package Level_1_Questions;

public class DigitProduct {
    static void main() {
        System.out.println(product(22));
    }
    static int product( int n){
        if (n % 10 == n){
            return n;
        }
        return (n % 10) * product(n/10);
    }
}
