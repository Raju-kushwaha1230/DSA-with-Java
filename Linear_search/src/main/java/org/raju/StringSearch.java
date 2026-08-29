package org.raju;

public class StringSearch {
    public static void main(String[] args) {
        String str = "Raju";
        char target = 'r';
        boolean result = LinearSearch(str, target);
        System.out.println(result);
    }

    static boolean LinearSearch(String str, char target){
        if(str.length()== 0 ){
            return false;
        }

//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == target){
//                return true;
//            }
//        }
        for (char c : str.toCharArray()){
            if (c==target){
                return true;
            }
        }

        return false;
    }
}
