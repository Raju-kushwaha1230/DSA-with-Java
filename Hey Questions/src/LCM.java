public class LCM {
    static void main() {
        System.out.println(lcm(19,2));

        int[] nums = {5,1,1,1,2};
        int  k = 1;
        System.out.println(subarrayLCM( nums, k));
    }
    static int lcm(int a, int b){
        return a * b / gcd (a,b);
    }


    static int subarrayLCM(int[] nums, int k){

    }


    static int gcd(int a, int b){
        if (a == 0){
            return b;
        }
        return gcd( b % a, a);
    }


}
