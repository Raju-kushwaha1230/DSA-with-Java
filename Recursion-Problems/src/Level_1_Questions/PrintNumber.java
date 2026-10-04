package Level_1_Questions;

public class PrintNumber {
    static void main() {
        print(5);
        printRev(5);
    }
    static void print(int n){
        if (n == 0){
            return;
        }
        System.out.print(n+ " ");
        print(n - 1);
    }
    static void printRev(int n){
        if (n==0){
            return;
        }
        printRev(n - 1);

        System.out.print( n + " ");
    }
}
