public class CountPrimes {
    static void main() {
        int n = 30;
        for (int i = 2; i < n; i++) {
            System.out.println(countPrime(n));
        }
    }
    static int countPrime(int n){
        int count = 0;
        int c = 2;

        while (c * c <= n){
            if(n % c != 0){
                count++;
            }
        }
        return count;
    }
}
