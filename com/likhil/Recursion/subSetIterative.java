package com.likhil.Recursion;

import java.util.ArrayList;
import java.util.List;

public class subSetIterative {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subSet(arr));
    }
    public static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<List<Integer>>();

        outer.add(new ArrayList<>());
        for(int num :arr){
            int n = outer.size();
            for(int i = 0; i < n; i++){
                List<Integer> Internal = new ArrayList<>(outer.get(i));
                Internal.add(num);
                outer.add(Internal);
            }
        }
        return outer;
    }
}
