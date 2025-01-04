package com.likhil.Recursion;

public class KBitNBinary {
    public static void main(String[] args) {
        int n = 3;
        int k = 1;
        String s = "0";
        String ans = generateString(n,k,1,s);
        System.out.println(ans.charAt(k));
        System.out.println(ans);
    }
        public static String generateString(int n, int k, int index, String s){
            if(index == n+1){
                return s;
            }
            s = s + "1" +reverse(invert(s));
            return generateString(n,k,index+1,s);
        }
        public static String invert(String s){
            String copy = "";
            for(int i=0; i<s.length();i++){
                char c = s.charAt(i) == '0'?'1':'0';
                copy +=c;
            }
            return copy;
        }
        public static String reverse(String s){
            String rev = "";
            for(int i=0; i<s.length();i++){
                char ch = s.charAt(i);
                rev = ch + rev;
            }
            return rev;
        }
    }
