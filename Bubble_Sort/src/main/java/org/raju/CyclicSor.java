package org.raju;

import java.util.Arrays;

public class CyclicSor {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIn = arr[i] - 1;
            if (arr[i] != arr[correctIn]){
                swap(arr, i, correctIn);
            }else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
