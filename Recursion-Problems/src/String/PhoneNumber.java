package String;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {
    static void main() {
//        swad("","12");
//        System.out.println(swadReturn("", "76"));
        System.out.println(letterCombination("", "98"));
    }

    static void swad(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit -1) * 3; i < digit * 3 ; i++) {
            char ch = (char) ('a' + i);
            swad(p + ch , up.substring(1));
        }

    }

    static List<String> swadReturn(String p, String up){
        if (up.isEmpty()){
            List<String>  ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        int digit =  up.charAt(0) - '0';

        List<String> ans = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(swadReturn(p + ch , up.substring(1)));

        }
        return  ans;

    }

    //leetcode 17

    static List<String> letterCombination(String p, String up){
        if (up.isEmpty()){
            List<String> ans  = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        int digit = up.charAt(0) - '0';// convert into digit
        List<String> ans = new ArrayList<>();

        if (digit == 7){
            for (int i = (digit - 2) * 3; i < (( digit - 1) * 3) + 1; i++) {
                char ch = (char) ( 'a' + i);
                ans.addAll(letterCombination( p + ch, up.substring(1)));
            }
        }
        if (digit == 8){
            for (int i = ((digit - 2) * 3) + 1; i < ((digit - 1) * 3) + 1; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(letterCombination(p + ch , up.substring(1)));
            }
        }
        if (digit == 9){
            for (int i = ((digit - 2) * 3) + 1; i < ((digit - 1) * 3) + 2; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(letterCombination(p + ch , up.substring(1)));
            }
        }
        if (digit < 7){
            for (int i = (digit - 2)  * 3; i < (digit - 1) * 3 ; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(letterCombination(p+ch, up.substring(1)));
            }
        }
        return ans;
    }
}
