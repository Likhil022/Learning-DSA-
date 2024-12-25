package com.likhil.Recursion;

public class sumOfDigits {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println(sumOfDigits(123459));
        System.out.println(reverse(123459, sum));
    }
    public static int sumOfDigits(int n) {
        if(n==0){
            return 0;

        }
        return n%10+sumOfDigits(n/10);
    }
    public static int reverse(int n, int sum) {
        if(n==0){
            return 0;
        }
        int digit = n%10;
        sum = sum*10+digit;
        return reverse(n/10,sum);
    }
}
