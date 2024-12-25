package com.likhil.Recursion;

public class minMaxArray {
    public static void main(String[] args) {
        int [] arr = new int[]{1,4,3,-5,-4};
        System.out.println(min(arr, 0));
        System.out.println(max(arr,0));
    }
    public static int min(int[] arr, int index){
        if(index == arr.length-1){
            return arr[index];
        }
        return Math.min(arr[index],min(arr,index+1));
    }
    public static int max(int[] arr, int index){
        if (index == arr.length-1){
          return arr[index];
        }
        return Math.max(arr[index],max(arr,index+1));

    }
}
