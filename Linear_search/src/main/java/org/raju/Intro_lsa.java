package org.raju;

public class Intro_lsa {
    public static void main(String[] args) {
        int[] arr = {20,40,2,45,41};
        int target = 45;
        int result = LinearSearch(arr,target);
        System.out.println(result);
    }

    static  int LinearSearch(int[] arr, int target){
        if(arr.length == 0){
            return 0;
        }
        for (int index = 0; index < arr.length ; index++) {
            if(arr[index]== target){
                return  index;
            }
        }
        return Integer.MAX_VALUE;
    }
}
