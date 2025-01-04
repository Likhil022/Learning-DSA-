package com.likhil.Leetcode;
import java.util.List;
import java.util.ArrayList;

public class luckyNumber {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };
        System.out.println(luckyNumbers(matrix));
    }
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        boolean isLucky = true;
        for( int i=0; i<matrix.length; i++){
            int index = findMin(matrix[i]);
            for( int j=0; j<matrix.length; j++){
                if(matrix[j][index]>matrix[i][index]){
                    isLucky = false;
                    break;
                }
            }
            if(isLucky){
                ans.add(matrix[i][index]);
            }
            isLucky = true;

        }
        return ans;

    }
    public static int findMin(int[] mat){
        int min = mat[0];
        int index = 0;
        for(int i=0; i<mat.length; i++){
            if(mat[i]<min){
                min = mat[i];
                index = i;
            }

        }
        return index;
    }
}
