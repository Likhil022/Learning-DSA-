package com.likhil.Recursion;

public class febinochi {
    public static void main(String[] args) {
        System.out.println(febi(1));
    }
    public static int febi(int n){
        if(n<2){
            return n;
        }
        return febi(n-1)+febi(n-2);
    }
}
