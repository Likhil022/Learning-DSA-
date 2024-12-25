package com.likhil.Recursion;

import java.util.Arrays;

public class printTiangle {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        printTriangleOfArr(arr);
    }
    public static void printTriangleOfArr(int[] arr) {
        if(arr.length == 0){
            return;
        }
        System.out.println(Arrays.toString(arr));
        int[] a = getNewArr(arr);
        arr = a;
        printTriangleOfArr(arr);
    }
    public static int[] getNewArr(int[] arr){
        int[] newArr = new int[arr.length-1];
        for(int i=0; i<=newArr.length-1;i++){
            newArr[i] = arr[i]+arr[i+1];
        }
        return newArr;
    }
}
