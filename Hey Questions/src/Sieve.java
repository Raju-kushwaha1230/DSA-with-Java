public class Sieve {
    static void main() {
        int n = 10;
        boolean[] primes = new boolean[n+1]; // initially the array is false
        System.out.println(primes[0]);
        seive(n, primes);
    }
    // false means that number is prime
    static void seive(int n, boolean[] primes){
        for (int i = 2; i * i < n ; i++) { // we are starting from 2 and doing sqrt(n) so until sqrt(n) the forloop will run

            if(!primes[i]){
                for (int j = i * 2; j < n + 1 ; j+=i) { // j should be multiple of i and then increment j by i so if i=3, j=6, then j+i = 6+3 = 9 so whatever the j number should come makeit as true
                    primes[j]= true;
                }
            }

        }
        for (int i = 2; i < n; i++) {
            if (!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
