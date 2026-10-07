package Sorting;

import java.util.Arrays;

public class MergeSort {
    static void main(String[] args) {
        int[] arr = { 5,2,3,1};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));

        int[] arr1 = {9,4,5,7,2,4};
        int[] res = sort(arr1, 0, arr1.length);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(arr1));
    }

    static int[] sort(int[] arr,int s,int e){
        if ( e- s <= 1){
            return arr;
        }

        int mid = s +( e - s) /2;

        sort(arr, s,mid);
        sort(arr,mid,e);

        return merge1(arr, s, e,mid);
    }

    static int[] merge1(int[] arr, int s,int e,int mid){
        int[] mix = new int[ e - s];

        int i = s;
        int j = mid;
        int k = 0;

        while (i < mid && j < e ){
            if (arr[i] <= arr[j]){
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while ( i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }

        return arr;
    }


    static int[] mergeSort(int[] arr){
        if (arr.length == 1){
            return arr;
        }

        int mid = arr.length /  2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }



    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length ];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length){

            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
