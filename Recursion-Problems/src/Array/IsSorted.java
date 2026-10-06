package Array;

public class IsSorted {
    static void main() {
        int[] arr = {2,3,4,5,6,7,99,9};
        System.out.println(sort(arr, 0));
    }
    static boolean sort(int[] arr, int index){
        // base consition
        if ( index == arr.length - 1 ){
            return true;
        }

        return  ( arr[index] < arr[index + 1]) && sort(arr, index +1);
    }
}
