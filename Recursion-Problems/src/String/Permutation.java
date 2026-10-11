package String;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    static void main() {
//        permutatuon("","abc");
        System.out.println(permutre("","abc"));
        System.out.println(permuAnsCount("", "abc"));
        System.out.println(permuteCountBody("", "abc", 0));

        int[] arr = {1,2,3,4};

        System.out.println(permute(new ArrayList<>(), arr, 0));
    }

    static void permutatuon(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i, p.length());

            permutatuon( first + ch + second, up.substring(1));
        }
    }

    static ArrayList<String>  permutre(String p,String up){
        if (up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {

            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            ans.addAll(permutre(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    static int permuAnsCount(String p, String up){
        if (up.isEmpty()){
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String l = p.substring(i, p.length());
            count = count + permuAnsCount(f + ch + l, up.substring(1));
        }

        return count;
    }

    static int permuteCountBody(String p, String up, int count){
        if ( up.isEmpty() ){
            return count + 1;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String l = p.substring(i, p.length());
            count =  permuteCountBody(f +ch +l, up.substring(1), count);
        }
        return count;
    }

    static List<List<Integer>> permute(List<Integer> p , int[] up, int index) {
        if (index == up.length){
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        int ch = up[index];
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i <= p.size(); i++) {

            List<Integer> left = new ArrayList<>(p);
            left.add(i, ch);

            ans.addAll(permute(left, up, index + 1));

        }
        return ans;
    }




}
