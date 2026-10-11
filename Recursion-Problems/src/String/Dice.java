package String;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    static void main() {
//        dice("",6);
        System.out.println(dice(new ArrayList<>(), 4));
    }
    static void dice(String p, int target){
        if (target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target- i);
        }
    }

    static List<List<Integer>> dice(List<Integer> p, int target){
        if (target == 0){
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            List<Integer> left = new ArrayList<>(p);
            left.add(i);
            ans.addAll(dice(left, target -i ));

        }
        return ans;
    }
}
