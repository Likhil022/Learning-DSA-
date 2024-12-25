package com.likhil.Recursion;

public class findTarget {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,12};
        System.out.println(findTarget(arr, 12,0));
        System.out.println(findIndex(arr, 12,0));
    }
    public static boolean findTarget(int[] arr, int target, int index){
        if(index == arr.length-1){
            return target == arr[index];
        }
        if(arr[index] == target){
            return true;
        }
        return findTarget(arr, target, index+1);
    }
    public static int findIndex(int[] arr, int target, int index){
        if(index == arr.length-1){
            return target ==arr[index] ?index :-1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndex(arr,target,index+1);
    }
}
