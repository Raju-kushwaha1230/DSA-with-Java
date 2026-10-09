package String;

import javax.swing.event.ListDataListener;
import java.util.ArrayList;
import java.util.List;

public class Subset {
    static void main() {
        int[] arr = {1,2,3};
//        System.out.println(subset(new ArrayList<>(), arr, 0));
        System.out.println(sub(arr));
    }

    static List<List<Integer>> subset(List<Integer> p, int[] up, int index){
        if (index == up.length){
            List<List<Integer>> s = new ArrayList<>();
            s.add( new ArrayList<>(p));
            return s;
        }
        int digit = up[index];

        List<List<Integer>> left = subset(p, up, index+ 1);

        List<Integer> withUP = new ArrayList<>(p);
        withUP.add(digit);

        List<List<Integer>>  right = subset(withUP, up , index +1);

        left.addAll(right);

        return left;

    }

    // iterative method

    static List<List<Integer>> sub(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for ( int x : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(x);
                outer.add(internal);
            }
        }
        return outer;
    }
}
