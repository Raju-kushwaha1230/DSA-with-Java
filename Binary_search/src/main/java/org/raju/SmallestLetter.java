package org.raju;

import java.util.Arrays;

// find the smallest letter greater than target
public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'a','d','f','l'};
        char target = 'l';
        char result =  ceilingLater(letters, target);
        System.out.println(result);
    }

    static char ceilingLater(char[] letters, char target){
        int start = 0;
        int end = letters.length -1 ;

        while (start <= end){

            int mid = start + (end - start)/ 2;
            if (target < letters[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return letters[start % letters.length];
    }
}
