public class SQRTProblem {
    static void main() {
        int n = 2147395600;
        int p = 3;
        System.out.println(sqrt(n,p));
    }
    static int sqrt(int n, int p){
        int s = 0;
        int e = n;
        double root = 0.0;
        // this is for decimal number
        while (s <= e){
            int m = s + (e - s) / 2;

            if (m * m == n){
                return m;
            }
            if (m * m > n){
                e = m -1;
            } else {
                s = m + 1;
            }
        }

        // this is for fraction number
        double incr = 0.1;

        for (int i = 0; i < p; i++) {

            while ( root * root <= n){
                 root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return (int) root;
    }
}
