package org.raju;

public class MinVl {
    public static void main(String[] args) {
        int[] arr = {23,34,452,45,3,86,33};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min ){
                min = arr[i];
            }
        }
        return min;
    }
}
