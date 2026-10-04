public class GCD {
    static void main() {
        System.out.println(gcd(4,9));

        int[] nums = {10,6,9};
        System.out.println(gcdArray(nums));
    }

    static int gcd(int a, int b){
        if (a==0){
            return b;
        }
        return gcd( b % a, a);
    }
    static int gcdArray(int[] n){
        int min = n[0];
        int max = n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] < min){
                min = n[i];
            }
              if (n[i] > max) {
                max = n[i];
            }
        }

        return gcd(min,max);
    }
}
