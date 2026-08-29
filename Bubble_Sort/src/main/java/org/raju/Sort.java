package org.raju;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {};
//        sortArray(arr);
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = findMax(arr,0,last);
            swap(arr, maxIndex, last);
        }
    }

    static  void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
    static int findMax(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last ; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }


    static int[] sortArray(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                // swap if less than next element
                if (arr[j] < arr[j-1]){ // here u can do change for descending and ascending order
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        return arr;
    }
}
