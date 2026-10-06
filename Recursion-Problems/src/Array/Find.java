package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Find {
    static void main() {
        int[] num = {4,2,6,9,9,4};
        int target = 9;
        System.out.println(find(num, target, 0));
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAllIndex(num,2, 0, list));
        System.out.println(findAllInd(num, target, 0));
    }

    static int findIndex(int[] n, int target, int index){
        //base condition
        if(index == n.length){
            return -1;
        }

        if ( n[index] == target ){
            return index;
        }
        return findIndex(n, target, index + 1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index,  ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if ( target == arr[index]){
              list.add(index);
        }
         return findAllIndex(arr, target, index + 1,list);

    }
    static ArrayList<Integer> findAllInd(int[] arr,int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow = findAllInd(arr,target, index + 1);

        list.addAll(ansFromBelow);
        return list;
    }


    static boolean find(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }

        return ( target == arr[index]) || find(arr, target, index + 1);
    }


}
