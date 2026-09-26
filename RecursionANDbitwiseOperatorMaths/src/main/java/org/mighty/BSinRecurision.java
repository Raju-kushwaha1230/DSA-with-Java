package org.mighty;

public class BSinRecurision {
    public static void main(String[] args) {
        int[] arr = {10,20,30,66,67,87};
        int target = 87;
        System.out.println(BinarySearch(arr, target,0,arr.length - 1));
    }
//return type

    static int BinarySearch(int[] arr,int target, int s, int e){
        // target doesnot exist in array
        if (s > e){
            return -1;
        }
        // find mid value in body and s,e should be in arguments
        int mid = s + ( e -s) / 2;
        //
        if(arr[mid]== target){
            return mid;
        }

        if(target < arr[mid]){
            return  BinarySearch(arr,target,s, mid-1); // left side of array
        }
        return BinarySearch(arr,target, mid+1, e);// right side of array
    }
}


