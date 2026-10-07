package Sorting;

import java.util.Arrays;

public class BubbleSort {
    static void main(String[] args) {
        int[] arr = {5,2,3,1};
        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int r,int c){
        if (r == 0){
            return;
        }
        if (c < r){
            if (arr[c] > arr[c + 1]){
                //swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSort(arr, r, c+1);
        }else {
            bubbleSort(arr,r - 1,0);
        }
    }

    static int[] bubble(int[] arr, int r, int c){
        if (r == 0){
            return  arr;
        }

        if (c < r){
            if (arr[c] > arr[c + 1]){
                //swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            return bubble(arr, r, c+1);
        }
        return  bubble(arr, r -1, 0);

    }

}
