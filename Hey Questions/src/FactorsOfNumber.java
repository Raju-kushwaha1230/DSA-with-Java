import java.lang.reflect.Array;
import java.util.ArrayList;

public class FactorsOfNumber {
    static void main() {
//        System.out.println(factor(20));
        int k = 3;
        int n = 12;
        ArrayList<Integer> ans = factor(n);
        System.out.print(ans + " ");

        for (int i = 0; i < ans.size(); i++) {
//            System.out.print(ans.get(i) + "  ");
            if (i + 1 == k){
                System.out.println(ans.get(i));
            }
        }
        int a = 12;
        int b = 6;
        ArrayList<Integer> ansa = factor(a);
        ArrayList<Integer> ansb = factor(b);
        System.out.print(ansa + " ");
        System.out.print(ansb + " ");
        System.out.println(" ");
         for (int x : ansa){
            if(ansb.contains(x)){
                System.out.println(x);
             }
        }

    }

    static  ArrayList<Integer>  factor(int n){
        ArrayList<Integer> ans = new ArrayList<>();

         for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                ans.add(i);
            }
        }
         return ans;
    }
}
