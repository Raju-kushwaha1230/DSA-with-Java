package org.raju;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// find all numbers disappear in array
public class DisappearElement {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        int[] result = findDisappear(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
    }
    static int[] findDisappear(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // search an element which is disappear
        List<Integer> missing = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (index + 1 != arr[index]){
                missing.add(index + 1);
            }
        }
        return missing.stream().mapToInt(Integer::intValue).toArray();
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
