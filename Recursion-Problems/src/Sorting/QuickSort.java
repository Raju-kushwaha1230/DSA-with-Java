package Sorting;

import java.util.Arrays;

public class QuickSort {
    static void main() {
        int[] arr = {5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    // low and high is used in recusion calls so im not taking start and end
    // start and end for swaping the element if voilating the rules
    // here taking pivot randomally like middle element
    // after first pass the pivot will be at correct place where left side lesser than pivot and right side greater than pivot
    // if start < pivot && end > pivot -- swap( start,end) start++ end --; -- for swaping
    // for recusion calls we need high and low
    // left = low , e; right = s, high

    static void sort(int[] arr, int low,int high){
        // base condition
        if (low >= high){
            return;
        }

        // choose pivot and swap it
        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int pivot = mid;

        while ( s <= e ){
            // for not voilating the rules
            while (arr[s] < arr[pivot]){
                s++;
            }
            while (arr[e] > arr[pivot]){
                e--;
            }

            // for voilation of rules
//            while (arr[s] > arr[pivot] && arr[e] < arr[pivot])

            if(s <= e){
                // swap
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }

        }

        sort(arr, low , e);
        sort(arr, s, high);


    }


}
