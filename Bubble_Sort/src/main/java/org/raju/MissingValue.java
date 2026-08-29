package org.raju;

public class MissingValue {
    public static void main(String[] args) {
        int[] arr = {0,2,3,1,5};
        int result = FindMissing(arr);
        System.out.println(result);
    }
    static int FindMissing(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // search
        for (int index = 0; index < arr.length; index++) {
            if (index != arr[index]){
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
